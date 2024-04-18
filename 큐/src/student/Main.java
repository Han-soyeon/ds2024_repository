package student;

import arrayQueue.ArrayQueue;
import common.QueueInterface;

public class Main {

	public static void main(String[] args) {
		// 큐에 3명의 학생 정보를 추가하고 차례대로 꺼내어 출력하시오.
		// 풀이 : 아래 두개의 LinkedQueue, ArrayQueue중 하나로 써도 됨
		//QueueInterface<Student> studentList = new LinkedQueue<>();
		QueueInterface<Student> studentList = new ArrayQueue<>();

		studentList.enqueue(new Student("한소연", "010-1234-5678"));
		studentList.enqueue(new Student("홍길동", "010-1234-5678"));
		studentList.enqueue(new Student("홍길순", "010-1234-5678"));
		
		
		// queue의 모든 원소를 꺼내어 출력하기
		 while (!studentList.isEmpty()) { // queue가 비어있지 않다면
			System.out.println(studentList.dequeue()); // 원소를 하나씩 꺼내라(입력한 순서대로)
		}
	}

}
