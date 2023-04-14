package quiz.customer;

public class Customer {
	private String name;
	private String address;
	private String tel;

	public Customer(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public Customer() {
	}

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
