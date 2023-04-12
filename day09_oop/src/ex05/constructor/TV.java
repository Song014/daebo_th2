package ex05.constructor;

public class TV {
	private String color;
	private int channel;

	public TV() {
	}
	
	public TV(String color) {
		this.color = color;
		channel = 777;
	}

	public TV(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}

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

	@Override
	public String toString() {
		return "TV [color=" + color + ", channel=" + channel + "]";
	}

}
