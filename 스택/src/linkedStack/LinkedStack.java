package linkedStack;

import common.StackInterface;

public class LinkedStack<E> implements StackInterface<E> {

	Node<E> topNode = null;

	public LinkedStack() {
		topNode = null;
	}

	@Override
	public void push(E newItem) {
		// 1. 첫번째 노드인 경우
		// 2. 1개 이상 노드가 있는 경우
		// 위의 두개의 조건을 처리할 수 있는 코드이다.
		topNode = new Node<E>(newItem, topNode);
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		}
		Node<E> temp = topNode;
		topNode = topNode.next;
		return temp.item;
	}

	@Override
	public E top() {
		if (isEmpty()) {
			return null;
		}
		return topNode.item;
	}

	@Override
	public boolean isEmpty() {
		return topNode == null;
	}

	@Override
	public void popAll() {
		topNode = null;
	}

	public void printAll() {
		Node<E> node = topNode;

		while (node != null) {
			System.out.println(node.item);
			node = node.next;
		}
	}

}
