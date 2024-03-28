package linkedList;

class Node {
	Integer item;
	Node next;

	public Node(Integer x, Node next) {
		this.item = x;
		this.next = next;
	}
}

public class IntegerLinkedList implements IntegerListInterface {

	private int numItems = 0;
	private Node head = new Node(-1, null);

	@Override
	public void add(int k, Integer x) {
		if (k < 0 || k > numItems) {
			return;
		}

		Node prevNode = head;

		for (int i = 0; i < k; i++) {
			prevNode = prevNode.next;
		}
		Node newNode = new Node(x, prevNode.next);

		newNode.next = prevNode.next;
		prevNode.next = newNode;
		numItems++;
	}

	@Override
	public void append(Integer x) {
		Node prevNode = head;

		while (prevNode.next != null) { // 현재 마지막 노드 찾기
			prevNode = prevNode.next;
		}

		Node newNode = new Node(x, null);
		prevNode.next = newNode;

		numItems++;
	}

	@Override
	public Integer remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeItem(Integer x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, Integer x) {
		// TODO Auto-generated method stub

	}

	@Override
	public int indexOf(Integer x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printAll() {
		Node node = head.next; // 더미 노드 다음 노드부터 시작

		while (node != null) {
			System.out.println(node.item);
			node = node.next;
		}
	}

}
