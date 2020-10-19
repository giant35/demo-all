import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.*
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel

fun main(args: Array<String>) {
    print("hello")
    val r = DiscardServer(8888)
    r.run()
}


class DiscardServer(var port: Int) : Runnable {
    override fun run() {
        print("server.run")
        val bossGroup = NioEventLoopGroup(1)
        var workerGroup = NioEventLoopGroup()
        try {
            val b = ServerBootstrap()
            with(b) {
                group(bossGroup, workerGroup)
                channel(NioServerSocketChannel::class.java)
                childHandler(E<SocketChannel>())
                //childHandler(SocketChannel())
                option(ChannelOption.SO_BACKLOG, 128)
                childOption(ChannelOption.SO_KEEPALIVE, true)
            }
            val f = b.bind(port).sync()
            f.channel().closeFuture().sync()
        } finally {
            bossGroup.shutdownGracefully()
            workerGroup.shutdownGracefully()
        }
    }
}

class E<T : Channel?> : ChannelInitializer<T>() {
    override fun initChannel(ch: T?) {
        print("new channel")
        ch?.pipeline()?.addLast(DiscardHandler())
    }
}

class DiscardHandler : ChannelInboundHandlerAdapter() {
    override fun channelRead(ctx: ChannelHandlerContext?, msg: Any?) {
        print("channel read")
        ctx?.write(msg)
    }

    override fun channelReadComplete(ctx: ChannelHandlerContext?) {
        ctx?.flush()
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext?, cause: Throwable?) {
        cause?.printStackTrace()
        ctx?.close()
    }
}
