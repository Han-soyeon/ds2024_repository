package arrayList_generic2;

import commmon.ListInterface;

public class Main {

	public static void main(String[] args) {
		// 업캐스팅
		ListInterface<Integer> integerList = new ArrayList<>();

		integerList.add(0, 800);
		integerList.add(1, 1000);
		integerList.append(1500);

		integerList.printAll();

		ArrayList<String> stringList = new ArrayList<>();

		stringList.add(0, "이건");
		stringList.add(1, "다른");
		stringList.append("방법의 메인클래스");

		stringList.printAll();

	}

}
