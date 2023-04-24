package ex01.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx2 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost(); //UnknownHostException 발생
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 주소 : " + address.getHostAddress());
        System.out.println("==============================================");
        
        address = InetAddress.getByName("www.naver.com");
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 주소 : " + address.getHostAddress());
        System.out.println("==============================================");

        byte[] addr = new byte[4]; // 192.168.0.61 
        addr[0] = (byte) 192;
        addr[1] = (byte) 168;
        addr[2] = (byte) 0;
        addr[3] = (byte) 13;

        address = InetAddress.getByAddress(addr);
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 이름 : " + address.getCanonicalHostName());
        System.out.println("로컬 호스트 주소 : " + address.getHostAddress());
        System.out.println("==============================================");
        
        InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
        for (InetAddress inetAddress : arr) {
            System.out.println("로컬 호스트 이름 : " + inetAddress.getHostName());
            System.out.println("로컬 호스트 주소 : " + inetAddress.getHostAddress());
        }
        
    }
}
