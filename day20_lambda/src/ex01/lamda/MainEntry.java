//package ex01.lamda;
//
//interface Message {
//    void something();
//}
//
//class Person {
//    public void greeting(Message msg) {
//        msg.something();
//    }
//}
//
//public class MainEntry {
//    public static void main(String[] args) {
//        Person p = new Person();
//
//        p.greeting(new Message() {
//            @Override
//            public void something() {
//                System.out.println("Good Morning");
//                System.out.println("ㅅㅂㅈㄷㅁㅎ");
//            }
//        });
//        System.out.println("-------------------------------------");
//
//        p.greeting(() ->{
//            System.out.println("Good after noon");
//            System.out.println("Yeah");
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
