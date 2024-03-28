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

	// 두명의 학생 정보가 동일하면 동일한 학생을 취급하고 싶어요~
	// equals 메서드의 오버라이드는 주의해서 해야 한다.
	@Override
	public boolean equals(final Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			return this.name.equals(s.name) && this.phoneNumber.equals(s.phoneNumber);
		} else {
			return false;
		}
	}
}
