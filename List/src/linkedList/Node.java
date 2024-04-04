package linkedList;

public class Node {
	// 원래는 item과 next 앞에 private를 해야하지만 수업상 예외로 private 제외
	Integer item;
	Node next;

	public Node(Integer x, Node next) {
		this.item = x;
		this.next = next;
	}
}
