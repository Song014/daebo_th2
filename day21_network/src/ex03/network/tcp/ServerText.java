package ex03.network.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerText {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        System.out.println("서버 시작");
        try {
            serverSocket = new ServerSocket(9000);
            socket = serverSocket.accept(); // 응답 대기

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            byte[] arr = new byte[100];
            is.read(arr);
            System.out.println(new String(arr));

            String msg = "안녕 클라야...";
            os.write(msg.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}