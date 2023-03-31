package day05_randomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(2)+1);
	}
}
