package generic;

public class Main {
	
	//boxing method
	public static <T> Box<T> boxing(T t){
		//데이터 타입 제테릭 T
		Box<T> box = new Box<T>();
		box.setContent(t);
		return box;
	}
	
	// unboxing method 생성
	public static <T> T unboxing(Box<T> box){
		return box.getContent();
	}

	public static void main(final String[] args) {
		Box<String> box0 = boxing("홍길동");
		String content0 = box0.getContent();
		System.out.println(content0);
		
		//Integer
		Box<Integer> box2 = new Box<>();
		box2.setContent(1);
		
		int content2 = box2.getContent();
		System.out.println(content2);
		
		//Boolean
		Box<Boolean> box3 = new Box<>();
		box3.setContent(false);
		
		boolean context3 = box3.getContent();
		System.out.println(context3);
	}

}
