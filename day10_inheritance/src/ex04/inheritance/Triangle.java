package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape{
	
	public Triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("넓이 높이 넣으세요");
		this.w = sc.nextInt();
		this.h = sc.nextInt();
	}
	
	public double calc() {
		this.result =  (double)(w*h)/2;
		return result;
	}

	@Override
	public String toString() {
		return String.format("넓이 = %d 높이 = %d 삼각형 넓이 = %.2f",w,h, calc());
	}
	
	
}
