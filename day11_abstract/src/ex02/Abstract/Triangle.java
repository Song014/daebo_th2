package ex02.Abstract;

public class Triangle extends Shape {
	int h = 10;

	@Override
	public double calc(double x) {
		result = x * h / 2;
		return result;
	}

	@Override
	public void show(String name) {
		System.out.printf("%.2f크기의 %s를 그려졌습니다.\n",calc(3.8),name);
	}

}
