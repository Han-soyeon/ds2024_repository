package arrayList1;

public class Main {

	public static void main(String[] args) {
		// 파일 생성시 크기 지정 안해주면 아래처럼 배열 크기 넣어주어야 한다.
		IntegerArrayList list = new IntegerArrayList();

		// 배열 삽입 - add
		list.add(0, 300);
		list.add(1, 500);
		list.append(800);

		// list.remove(2);
		Integer x = list.remove(1);
		System.out.println("삭제된 원소는" + x + "입니다.");

		boolean result = list.removeItem(800);

		if (result) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 성공");
		}

		list.get(300);

		list.printAll();
	}

}
