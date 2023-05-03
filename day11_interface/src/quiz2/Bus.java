package quiz2;

public class Bus implements Transport {
	private double speed = 0;

	@Override
	public void move() {
		while (speed < 5) {
			speed += accelerator * 5;
			System.out.println("Aceelerating ...." + speed);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("멈춤");
	}

}
