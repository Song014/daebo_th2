package ex02.Abstract;

public class Rect extends Shape {
	int h = 10;

	@Override
	public double calc(double x) {
		result = x * h;
		return result;
	}

	@Override
	public void show(String name) {
		System.out.printf("%.2f크기의 %s이 그려졌습니다.\n",calc(8.8),name);
	}

}
