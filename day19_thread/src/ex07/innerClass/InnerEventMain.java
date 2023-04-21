package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEventMain {

    public static void main(String[] args) {
        Frame frame = new Frame("이벤트 처리 - 이너클래스");
        Button btn = new Button("Button - Start");

        btn.addActionListener(new ActionListener() { // 익명(무명) 클래스
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent가 발생 했슴다.");
                System.out.println(e.getActionCommand());
                System.out.println(e.getSource());
                System.out.println();
            }
        }); // 버튼에 이벤트 생성

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(btn);// 프레임(윈도우)에 버튼 컴포넌트를 추가
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.setLocation(300, 150);
    }
}

//public class InnerEventMain {
//
//    public static void main(String[] args) {
//        Frame frame = new Frame("이벤트 처리 - 이너클래스");
//        Button btn = new Button("Button - Start");
//
//        btn.addActionListener(new ActionListener() { // 익명(무명) 클래스
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ActionEvent가 발생 했슴다.");
//                System.out.println(e.getActionCommand());
//                System.out.println(e.getSource());
//                System.out.println();
//            }
//        }); // 버튼에 이벤트 생성
//
//        frame.add(btn);// 프레임(윈도우)에 버튼 컴포넌트를 추가
//        frame.setVisible(true);
//        frame.setSize(300, 200);
//        frame.setLocation(300, 150);
//    }
//}

//public class InnerEventMain {
//    class EventHandler implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("ActionEvent가 발생 했슴다.");
//            System.out.println(e.getActionCommand());
//            System.out.println(e.getSource());
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Frame frame = new Frame("이벤트 처리 - 이너클래스");
//        Button btn = new Button("Button - Start");
//
//        EventHandler handler = new InnerEventMain().new EventHandler();
//        btn.addActionListener(handler); // 버튼에 이벤트 생성
//
//        frame.add(btn);// 프레임(윈도우)에 버튼 컴포넌트를 추가
//        frame.setVisible(true);
//        frame.setSize(300, 200);
//        frame.setLocation(300, 150);
//    }
//}