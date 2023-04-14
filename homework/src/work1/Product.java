package work1;

public class Product {
	private Stock Storage;
	private String code;
	private String name;
	private String price;

	public Stock getStorage() {
		return Storage;
	}

	public void setStorage(Stock storage) {
		Storage = storage;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
