import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDP1 {
    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket();) {
            socket.setSoTimeout(5000);
            DatagramPacket packet = new DatagramPacket(new byte[1], 1, InetAddress.getByName("time.nist.gov"), 13);
            socket.send(packet);

            DatagramPacket recvPacket = new DatagramPacket(new byte[1024], 1024);
            socket.receive(recvPacket);
            String data = new String(recvPacket.getData(), StandardCharsets.UTF_8);
            System.out.println("data:" + data);
        }
    }
}
