package ex04.oop;

public class MainEntry {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("송기석");
		person.setAge(29);
		person.setAddress("증산로 299");
		person.setHeight(170);
		person.setWeight(76);
		person.setPhone("010-2408-1111");
		
		System.out.println(person);
		
	}
}
