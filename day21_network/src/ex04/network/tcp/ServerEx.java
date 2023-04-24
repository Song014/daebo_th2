package ex04.network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null, stin = null;
        BufferedWriter bw = null;
        ServerSocket ss = null;
        Socket s = null;
        System.out.println("연결됨.....송기석 서버");

        try {
            ss = new ServerSocket(8000);
            s = ss.accept();

            br = new BufferedReader(new InputStreamReader(s.getInputStream())); // 소켓 통해서 데이터 읽어옴
            // 키보드 입력 스트림
            stin = new BufferedReader(new InputStreamReader(System.in));
            // 클라이언트 출력 스트림
            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            String inputMessage;

            while (true) {
                inputMessage = br.readLine(); // 클라이언트에서 한행의 문자열 읽음
                // 클라이언트에서 "EXIT"를 보내면 연결 종료
                if (inputMessage.equalsIgnoreCase("exit"))
                    break;

                System.out.println(inputMessage); // 클라이언트가 보낸 메시지 화면 출력

                System.out.println("채팅 입력 : ");
                String outputMessage = stin.readLine(); // 키보드에서 한행 읽고
                // 클라이언트한테 전송
                bw.write(s.getInetAddress() + " 송 서버> " + outputMessage + "\n");
                bw.flush();
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                s.close();
            } catch (Exception e) {
                System.err.println("클라이언트와 채팅중 오류 발생............");
            }
        }
    }
}
