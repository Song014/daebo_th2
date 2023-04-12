package quiz;

public class Plain implements Trans{
	
	@Override
	public void start(String name) {
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "가 멈춥니다.");
	}

	@Override
	public void show(String name) {
		start(name);
		stop(name);
	}
}
