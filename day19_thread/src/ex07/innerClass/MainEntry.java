package ex07.innerClass;

class OuterClass {
    static int no;
    String message = "hello~~~~";

    public void outerMethod() {
        System.out.println("outer method call~~~~");
    }

    class InnerClass {
        int su = 99;

        public void show() {
            System.out.println(su); // 내거 사용가능
            System.out.println(message); // 밖에거도 사용가능
        }

        public void disp() {
            outerMethod();
        }
    }//Inner
}//Outer

public class MainEntry {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.disp();
        ic.show();
        System.out.println("=====================================");
        
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        inner.show();
    }
}
