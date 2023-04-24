package ex04.network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) {
        BufferedReader br = null, stin = null;
        BufferedWriter bw = null;
        Socket s = null;

        try {
            System.out.println("ip주소 입력 포트까지 : ");
            String[] ip = new Scanner(System.in).nextLine().split(" ");
            s = new Socket(ip[0], Integer.parseInt(ip[1])); // 127.0.0.1

            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            stin = new BufferedReader(new InputStreamReader(System.in));

            String outputMessage;

            while (true) {
                System.out.println("채팅 입력 : ");
                outputMessage = stin.readLine();

                if (outputMessage.equalsIgnoreCase("exit")) {
                    bw.write(outputMessage);
                    bw.flush();
                    break;
                }

                bw.write(s.getInetAddress() + " 클라이언트> " + outputMessage + "\n");
                bw.flush();

                String inputMessage = br.readLine();
                System.out.println(inputMessage);

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                s.close();
            } catch (IOException e) {
                System.err.println("클라이언트와 채팅중 오류 발생............");

            }
        }
    }
}
