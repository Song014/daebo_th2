package quiz;

public abstract class Trans {
	protected String name;
	public void name(String name) {
		this.name = name;
	}
	
	public abstract void start();
	public abstract void stop();
	
	public void show() {
		start();
		stop();
	}
}
