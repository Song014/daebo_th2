package ex04.oop;
/** 이름 주소 전화번호 나이 키 무게 */
public class Person {
	private String name, address, phone;
	private int age, height, weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void disp() {
		System.out.println("Person [name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age + ", height="
				+ height + ", weight=" + weight + "]");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age + ", height="
				+ height + ", weight=" + weight + "]";
	}

}
