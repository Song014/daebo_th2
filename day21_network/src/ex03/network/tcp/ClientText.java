package ex03.network.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientText {
    public static void main(String[] args) {
        Socket clientSocket = null;

        try {
            clientSocket = new Socket("127.0.0.1", 9000); // 서버 ip, port

            InputStream is = clientSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();

            String str = "안녕 서버야...";
            os.write(str.getBytes());
            
            byte[] buffer = new byte[100];
            is.read(buffer);
            System.out.println(new String(buffer));
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
