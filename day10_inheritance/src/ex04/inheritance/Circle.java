package ex04.inheritance;

import java.util.Scanner;

public class Circle extends Shape { // sub class 자손 클래스

	public Circle() {
		super(2, 3);
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 넣으세요");
		this.w = sc.nextInt();
		this.h = sc.nextInt();
	}

	public double calc() {
		this.result = (w * w * Math.PI);
		return result;
	}

	@Override
	public String toString() {
		return String.format("반지름 = %d, 원의 넓이 = %.2f",w, calc());
	}

}
