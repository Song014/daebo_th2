package ex02.network;

import java.io.IOException;
import java.net.URL;

public class URLEx2 {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://www.google.com/search?q=kim+yeon+a&oq=kim+yeon+a&aqs=chrome..69i57.11575j0j9&sourceid=chrome&ie=UTF-8");
        URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=김연아");
        
        System.out.println("프로토콜"+url.getProtocol());
        System.out.println("호스트와 포트"+url.getAuthority());
        System.out.println("호스트"+url.getHost());
        System.out.println("포트"+url.getPort());
        System.out.println("경로"+url.getPath());
        System.out.println("질의"+url.getQuery());
        System.out.println("파일명"+url.getFile());
        System.out.println("참조"+url.getRef());
    }
}
