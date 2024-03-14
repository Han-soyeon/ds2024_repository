package basic;

public class Main {

	public static void main(String[] args) {
		// main 클래스 분리
		Basic basic1 = new Basic("홍길동", 21);
		Basic basic2 = new Basic("홍길순", 21);
		//basicl.name = "홍길동";
		
		System.out.println(basic1.getName());
		System.out.println(basic1.getAge());
		
		System.out.println(basic2.getName());
		System.out.println(basic2.getAge());
		
		Extended extended1 = new Extended("홍길동", 21, "대전광역시 유성구 덕명동");
		System.out.println(extended1.getName());
		System.out.println(extended1.getAge());
		System.out.println(extended1.getAddress());

		Basic extended2 = new Extended("홍길동", 21, "대전광역시 유성구 덕명동");
		System.out.println(extended2.getName());
		System.out.println(extended2.getAge());
		//System.out.println(extended1.getAddress());

	}

}
