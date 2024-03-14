package basic;

public class Basic {
	//나이와 이름 클래스
	//클래스 이름은 대문자로 시작하는 것이 일반적이다.
	private String name;
	private int age;
	
	public Basic(final String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}
	
}
