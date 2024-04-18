package linkedqueue;

import common.QueueInterface;

public class LinkedQueue<E> implements QueueInterface<E> {

	private Node<E> tail;

	public LinkedQueue() {
		tail = null;
	}

	@Override
	public void enqueue(E newItem) {
		Node<E> newNode = new Node<>(newItem, null);

		// 첫번째 노드인 경우
		if (isEmpty()) {
			newNode.next = newNode;
			tail = newNode;
		}
		// 그렇지 않은 경우
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		}

		E tmp = tail.next.item;
		if (tail.next == tail) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
		return tmp;
	}

	@Override
	public E front() {
		if (isEmpty()) {
			return null;
		}
		
		return tail.next.item; //front.item
	}

	@Override
	public boolean isEmpty() {
		// isFull은 거의 구현하지 않는다. 메모리가 꽉 찰 일이 별로 없기 때문
		return tail == null;
	}

	@Override
	public void dequeueAll() {
		//TODO Auto-generated method stub  << 메소드가 무슨역할을 한다는 것을 알려주는 일종의 규칙으로 보통 이 줄이 있으면 지우는 것이 맞다
		tail = null;
	}
}
