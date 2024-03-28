package arrayList_generic1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integerList = new ArrayList<>();

		integerList.add(0, 300);
		integerList.add(1, 500);
		integerList.append(800);

		integerList.printAll();

		ArrayList<String> stringList = new ArrayList<>();

		stringList.add(0, "안녕하세요");
		stringList.add(1, "저는");
		stringList.append("한소연입니다");

		stringList.printAll();
	}

}
