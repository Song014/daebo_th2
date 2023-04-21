//package ex01.lamda;
//
//interface Message {
//    int something(int x); // int return , paramater X
//}
//
//class Person {
//    public void greeting(Message msg) {
//        int su = msg.something(30);
//        System.out.println("message interface something : " + su);
//    }
//}
//
//public class MainEntry3 {
//    public static void main(String[] args) {
//        Person p = new Person();
//
//        p.greeting(new Message() {
//
//            @Override
//            public int something(int x) {
//                System.out.println("안녕하세요");
//                System.out.println("한주동안 수고");
//                return 110;
//            }
//        });
//        System.out.println("-------------------------------------");
//
//        p.greeting(x -> {
//            System.out.println("Good after noon");
//            System.out.println("Yeah");
//            return 20;
//        });
//        //        System.out.println(sum(1, 2));
//
//    }
//
//    public int sum(int x, int y) {
//        return x + y;
//    }
//
//}
