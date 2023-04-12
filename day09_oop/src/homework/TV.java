package homework;

public class TV {
	private String color;
	private int channel;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void disp() {
		System.out.println(color + " " + channel);
	}
}