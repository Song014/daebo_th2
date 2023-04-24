package ex01.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class GetAllByNameEx {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strUrl = null;
        InetAddress[] address;
        
        System.out.println("Site 주소 = ");
        try {
            strUrl = br.readLine();
            address = InetAddress.getAllByName(strUrl);
            
            for (InetAddress inetAddress : address) {
                System.out.println(inetAddress);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
