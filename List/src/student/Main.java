package student;

import arrayList_generic2.ArrayList;
import arrayList_generic2.ListInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListInterface<Student> studentList = new ArrayList<>();

		studentList.add(0, new Student("한소연", "010-1234-5678"));
		studentList.add(1, new Student("홍길동", "010-1234-5678"));
		studentList.append(new Student("개나리", "010-1234-5678"));

		studentList.printAll();

		System.out.println("\n");

		studentList.removeItem(new Student("개나리", "010-1234-5678"));
		studentList.printAll();
	}

}
