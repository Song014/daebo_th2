package ex01.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        
        try {
            InetAddress[] address = InetAddress.getAllByName(host);
            
            for (InetAddress inetAddress : address) {
                System.out.println(inetAddress.getCanonicalHostName());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
