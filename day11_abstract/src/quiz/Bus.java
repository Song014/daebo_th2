package quiz;

public class Bus extends Trans {

	@Override
	public void start() {
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println(name + "가 멈춥니다.");
	}
}
