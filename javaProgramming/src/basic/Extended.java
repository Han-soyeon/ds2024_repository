package basic;

public class Extended extends Basic {

	private String address;
	
	public Extended(final String name, final int age, final String address) {
		
		//super 생성자는 바로 위에 생성 되어 있어야 함
		super(name, age);
		this.address = address;
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
