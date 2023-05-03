package ex01.Interface;

interface A {
    int X = 9;
    final int Y = 7777;

    public void show();

    public abstract void disp();
} // A end

interface B {
    void view();
}

interface C {
    String name = "rltjr";

    public void draw();
}

interface D extends B {
    void dview();
}

class Rect implements D {

    @Override
    public void view() {
    }

    @Override
    public void dview() {
    }

    public int plus(int x, int y) {
        return x + y;
    }
} // Rect end

class Shape {

} // Shape End

class Circle implements C {

    @Override
    public void draw() {
        System.out.println(name + "님이에요");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }

}

// class Multi extends Shape implements B, C, A {
class Multi extends Shape implements B, C, A {

    @Override
    public void show() {

    }

    @Override
    public void disp() {

    }

    @Override
    public void draw() {

    }

    @Override
    public void view() {

    }

} // Multi End

public class MainEntry {

    public static void main(String[] args) {

    }

}
