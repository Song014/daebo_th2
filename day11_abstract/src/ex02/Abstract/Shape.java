package ex02.Abstract;

public abstract class Shape {
	double result = 0;
	
	public abstract double calc(double x); //abstract Method
	public abstract void show(String name);
	public void view() {
		System.out.println("Super Class Shape");
	}
	
}
