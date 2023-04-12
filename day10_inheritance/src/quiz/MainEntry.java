package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Sawoen sawoen1 = new Sawoen(1, "송기석","010-2222-2222");
		Sawoen sawoen2 = new Sawoen(2, "김가네", "대리", "개발", 3000, "010-3333-3333");
		
		System.out.println(sawoen1);
		System.out.println("===================================================");
		System.out.println(sawoen2);
	}
}
