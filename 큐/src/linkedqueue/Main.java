package linkedqueue;

import common.QueueInterface;

public class Main {

	public static void main(String[] args) {
		//interface를 만들고 LinkedQueue를 사용할 것입니다.
		//LinkedQueue는 별도의 인덱스 크기가 필요 없다.
		QueueInterface<String> queue = new LinkedQueue<>();
		
		queue.enqueue("1월");
		queue.enqueue("2월");
		queue.enqueue("3월");
		queue.enqueue("4월");
		
		//queue의 모든 원소를 꺼내어 출력하기
		while (!queue.isEmpty()) { //queue가 비어있지 않다면
			System.out.println(queue.dequeue()); // 원소를 하나씩 꺼내라(입력한 순서대로)
		}
	}
}
