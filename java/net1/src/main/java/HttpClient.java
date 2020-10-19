import java.io.*;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket()) {
            socket.setSoTimeout(5000);
            SocketAddress addr = new InetSocketAddress("www.baidu.com", 80);
            socket.connect(addr);
            try (final Writer writer = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
                 final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                writer.write("GET / HTTP/1.1\r\nHost: www.baidu.com\r\n\r\n");
                writer.flush();

                String line;
                while (null != (line = reader.readLine())) {
                    System.out.println(line);
                }
            }
        }
    }
}
