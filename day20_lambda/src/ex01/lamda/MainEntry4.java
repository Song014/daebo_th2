//package ex01.lamda;
//
//interface Message {
//    int something(int x, int y); // int return , paramater X
//}
//
//class Person {
//    public void greeting(Message msg) {
//        int su = msg.something(30, 50);
//        System.out.println("message interface something : " + su);
//    }
//}
//
//public class MainEntry4 {
//    public static void main(String[] args) {
//        Person p = new Person();
//
//        p.greeting(new Message() {
//
//            @Override
//            public int something(int x, int y) {
//                System.out.println("안녕하세요");
//                System.out.println("한주동안 수고");
//                return 110;
//            }
//        });
//        System.out.println("-------------------------------------");
//
//        p.greeting((x, y) -> {
//            System.out.println("Good after noon");
//            System.out.println("Yeah");
//            return 260;
//        });
//        
//        //        System.out.println(sum(1, 2));
//    }
//
//    public int sum(int x, int y) {
//        return x + y;
//    }
//
//}
