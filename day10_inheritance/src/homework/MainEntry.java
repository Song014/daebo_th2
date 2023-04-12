package homework;

public class MainEntry {
	public static void main(String[] args) {
		Sales song = new Sales("A000","송기석","개발","010-8888-8888","사원",0.5);
		System.out.println(song);
		
		Sales kim = new Sales("A001","김기석","영업","010-7777-7777","대리",2);
		System.out.println(kim);
		
		PartTime da = new PartTime("P001", "DADA", "파트타임", "010-2222-3333", 5, 20);
		System.out.println(da);
	}
}
