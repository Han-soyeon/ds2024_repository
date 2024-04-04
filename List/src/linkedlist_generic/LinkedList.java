package linkedlist_generic;

import commmon.ListInterface;

public class LinkedList<E> implements ListInterface<E> {

	private int numItems = 0;
	private Node<E> head = new Node<>(null, null);

	@Override
	public void add(int k, E x) {
		if (k < 0 || k > numItems) {
			return;
		}

		Node<E> prevNode = getNode(k - 1);

		Node<E> newNode = new Node<E>(x, prevNode.next);

		newNode.next = prevNode.next;
		prevNode.next = newNode;
		numItems++;
	}

	private Node<E> getNode(int k) {
		if (k >= -1 && k <= numItems - 1) {

			Node<E> currNode = head;

			for (int i = 0; i <= k; i++) {
				currNode = currNode.next;
			}
			return currNode;
		} else {
			return null; // 에러
		}
	}

	@Override
	public void append(E x) {
		Node<E> prevNode = head;

		while (prevNode.next != null) { // 현재 마지막 노드 찾기
			prevNode = prevNode.next;
		}

		Node<E> newNode = new Node<E>(x, null);
		prevNode.next = newNode;

		numItems++;

	}

	@Override
	public E remove(int k) {
		if (k < 0 || k > numItems - 1) {
			return null;
		}

		Node<E> preNode = getNode(k - 1);

		// preNode.next = preNode.next.next;를 아래줄로 나타낼 수 있다.
		Node<E> currNode = preNode.next;

		preNode.next = currNode.next;
		numItems--;

		return currNode.item;
	}

	@Override
	public boolean removeItem(E x) {
		Node<E> currNode = head, preNode;

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
	public E get(int k) {
		// 예외처리
		if (k < 0 || k > numItems - 1) {
			return null;
		}

		return getNode(k).item;
	}

	@Override
	public void set(int k, E x) {
		// 예외처리
		if (k < 0 || k > numItems - 1) {
			return;
		}
		getNode(k).item = x;

	}

	@Override
	public int indexOf(E x) {
		// removeItem 메서드
		// item 값이 x인 노드의 위치를 반환하는 메서드
		Node<E> currNode = head;

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
		head = new Node<E>(null, null);
	}

	@Override
	public void printAll() {
		Node<E> node = head.next; // 더미 노드 다음 노드부터 시작

		while (node != null) {
			System.out.println(node.item);
			node = node.next;
		}
	}
}
