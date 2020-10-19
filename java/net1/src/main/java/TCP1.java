import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCP1 {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket();
        ) {
            socket.setSoTimeout(5000);
            socket.connect(new InetSocketAddress(InetAddress.getByName("time.nist.gov"), 13));
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                String line;
                while (null != (line = reader.readLine())) {
                    System.out.println(line);
                }
            }
        }
    }
}
