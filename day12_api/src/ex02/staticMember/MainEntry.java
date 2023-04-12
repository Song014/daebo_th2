package ex02.staticMember;

class Atm {
	int count; // 인스턴스 멤버
	static int total; // 스태틱 멤버

	public Atm(int amount) {
		count += amount;
		total += amount;
	}

	public static void view() {
		total += 100;
//		count += 100;
	}
	
	public static void show(int count, int total) {
//		this.count = count;
//		this.total = total;
	}

	public void disp() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm atm = new Atm(3000);
		atm.disp();
		System.out.println();
		Atm atm1 = new Atm(3000);
		atm1.disp();
		System.out.println();
		Atm atm2 = new Atm(3000);
		atm2.disp();
	}
}
