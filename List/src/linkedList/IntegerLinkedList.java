package linkedList;

public class IntegerLinkedList implements IntegerListInterface {

	private int numItems = 0;
	private Node head = new Node(-1, null);

	@Override
	public void add(int k, Integer x) {
		if (k < 0 || k > numItems) {
			return;
		}

		Node prevNode = getNode(k - 1);

		Node newNode = new Node(x, prevNode.next);

		newNode.next = prevNode.next;
		prevNode.next = newNode;
		numItems++;
	}

	private Node getNode(int k) {
		if (k >= -1 && k <= numItems - 1) {

			Node currNode = head;

			for (int i = 0; i <= k; i++) {
				currNode = currNode.next;
			}
			return currNode;
		} else {
			return null; // 에러
		}
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
	public Integer remove(int k) {
		if (k < 0 || k > numItems - 1) {
			return null;
		}

		Node preNode = getNode(k - 1);

		// preNode.next = preNode.next.next;를 아래줄로 나타낼 수 있다.
		Node currNode = preNode.next;

		preNode.next = currNode.next;
		numItems--;

		return currNode.item;
	}

	@Override
	public boolean removeItem(Integer x) {
		Node currNode = head, preNode;

		for (int i = 0; i < numItems; i++) {
			preNode = currNode;
			currNode = currNode.next;

			if (currNode.item.equals(x)) {
				preNode.next = currNode.next;
				numItems--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Integer get(int k) {
		// 예외처리
		if (k < 0 || k > numItems - 1) {
			return null;
		}

		return getNode(k).item;
	}

	@Override
	public void set(int k, Integer x) {
		// 예외처리
		if (k < 0 || k > numItems - 1) {
			return;
		}
		getNode(k).item = x;
	}

	@Override
	public int indexOf(Integer x) {
		// removeItem 메서드
		// item 값이 x인 노드의 위치를 반환하는 메서드
		Node currNode = head;

		for (int i = 0; i < numItems; i++) {
			currNode = currNode.next;
			if (currNode.item.equals(x)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int size() {
		return numItems;
	}

	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	@Override
	public void clear() {
		head = new Node(-1, null);
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
