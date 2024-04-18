package student;

public class Student {
	private String name;
	private String phoneNumber;

	Student(final String name, final String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
}
