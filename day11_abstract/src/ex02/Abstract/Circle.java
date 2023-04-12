package ex02.Abstract;

public class Circle extends Shape { // 부모의 추상메소드 오버라이드 해야함

	@Override
	public double calc(double x) {
		result = x * x * Math.PI;
		return result;
	}

	@Override
	public void show(String name) {
		System.out.printf("%.2f반지름의 %s이 그려졌습니다.\n",calc(5.5),name);
	}

}
