package ex05.network.chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (args.length != 1) {
            System.out.println("USAGE : TcpMultiChatClient nickName ? ");
            System.exit(0);
        }

        try {
            System.out.println("아이피 주소와 포트 입력");
            String[] str = br.readLine().split(" ");

            Socket s = new Socket(str[0], Integer.parseInt(str[1]));
            System.out.println("서버 연결 됨");

            Thread sender = new Thread(new ClientSender(s, args[0]));
            Thread receiver = new Thread(new ClientRecevier(s));

            sender.start();
            receiver.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class ClientSender extends Thread {
        Socket s;
        DataOutputStream dos;
        String name;

        public ClientSender(Socket s, String name) {
            this.s = s;
            try {
                dos = new DataOutputStream(s.getOutputStream());
                this.name = name;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);

            try {
                if (dos != null)
                    dos.writeUTF(name);
                while (dos != null)
                    dos.writeUTF("[" + name + "] " + sc.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    static class ClientRecevier extends Thread {
        Socket s;
        DataInputStream dis;

        public ClientRecevier(Socket s) {
            this.s = s;
            try {
                dis = new DataInputStream(s.getInputStream());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        @Override
        public void run() {
            while(dis!=null) {
                try {
                    System.out.println(dis.readUTF());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
