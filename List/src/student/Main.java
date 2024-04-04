package student;

//import arrayList_generic2.ArrayList;
import commmon.ListInterface;
import linkedlist_generic.LinkedList;

public class Main {

	public static void main(String[] args) {
		//ListInterface<Student> studentList = new ArrayList<>();

		ListInterface<Student> studentList = new LinkedList<>();

		studentList.add(0, new Student("한소연", "010-1234-5678"));
		studentList.add(1, new Student("홍길동", "010-1234-5678"));
		studentList.append(new Student("개나리", "010-1234-5678"));

		studentList.printAll();

		System.out.println("\n");

		studentList.removeItem(new Student("개나리", "010-1234-5678"));
		studentList.printAll();
	}

}
