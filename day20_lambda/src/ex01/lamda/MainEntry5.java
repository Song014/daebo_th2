package ex01.lamda;

@FunctionalInterface
interface Message {
//    int gog(int x);
    void something(int x, int y); // paramater 0
}

@FunctionalInterface
interface Talk {
    void something(String x, String y); // paramater 0
}

class Person {
    public void greeting(Message msg) {
        msg.something(30, 50);
    }

    public void greeting(Talk msg) {
        msg.something("Hello", "world");
    }
}

public class MainEntry5 {
    public static void main(String[] args) {
        Person p = new Person();

        p.greeting(new Message() {
            @Override
            public void something(int x, int y) {
                System.out.println("안녕하세요");
                System.out.println("한주동안 수고");
            }
        });
        System.out.println("-------------------------------------");

        p.greeting((String x, String y) -> {
            System.out.println("Good after noon");
            System.out.println("Yeah");
            System.out.println(x + " " + y);
            char ch = 'K';
//            ch=p; // 값 변경 불가 
            System.out.println(ch); // 출력은 가능
        });
        p.greeting((int x, int y) -> {
            System.out.println("Good after noon");
            System.out.println("Yeah");
            System.out.println(x + " " + y);
            num = 29; // 스태틱 변수 값은 변경 가능
            System.out.println(num);
        });
        
        
        

    }

    static int num = 30;

}
