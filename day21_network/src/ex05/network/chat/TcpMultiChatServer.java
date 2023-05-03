package ex05.network.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatServer { // outer class

    HashMap clients; // k,v

    public TcpMultiChatServer() { // 생성자 함수 - 멤버변수 초기화 담당
        clients = new HashMap<>();// HashMap 객체 생성
        Collections.synchronizedMap(clients);
    }

    public void start() { // user method
        ServerSocket ss = null;
        Socket s = null;

        try {
            ss = new ServerSocket(7777);
            System.out.println("서버 생성완료 채팅 시작합니다");
            while (true) {
                s = ss.accept();// 응답 대기, 클라이언트 소켓;
                System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속하셧습니다.");
                ServerReciver thread = new ServerReciver(s);// user class
                thread.start();
            } // while END
        } catch (Exception e) {
            e.printStackTrace();
        } 
    } // START END

    class ServerReciver extends Thread {// inner class
        Socket s;
        DataInputStream dis;
        DataOutputStream dos;

        public ServerReciver(Socket s) {
            this.s = s;
            try {
                this.dis = new DataInputStream(s.getInputStream());
                this.dos = new DataOutputStream(s.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void sendToAll(String msg) {
            Iterator it = clients.keySet().iterator();
            
            while(it.hasNext()) {
                try {
                    DataOutputStream dos = (DataOutputStream) clients.get(it.next());
//                    System.out.println("dos.toString() : "+dos.toString());
                    dos.writeUTF(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        } // sendToAll END

        @Override
        public void run() { // 쓰레드 구현부
            String name = "";
            try {
                name = dis.readUTF();
                sendToAll("#" + name + " 님이 입장하셧습니다.");
                clients.put(name, dos);// 
                System.out.println("현재 서버 접속자 수는 : "+clients.size()+" 입니다.");
                while(dis!=null) {
                    sendToAll(dis.readUTF());
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sendToAll("#"+name+" 님이 나가셧습니다.");
                clients.remove(name);
                System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속 종료하셧습니다.");
                System.out.println("현재 서버 접속자 수는 : "+clients.size()+" 입니다.");
            }
        }

    } // inner class END

    public static void main(String[] args) {
        new TcpMultiChatServer().start();
    }
}
