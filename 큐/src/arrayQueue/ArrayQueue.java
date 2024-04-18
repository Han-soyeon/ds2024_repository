package arrayQueue;

import common.QueueInterface;

public class ArrayQueue<E> implements QueueInterface<E> {

	private E queue[]; // 배열확보

	private int front; // 요소선언
	private int tail;
	private int numItems;

	private static final int DEFAULT_CAPACITY = 64; // 배열의 크기

	@SuppressWarnings("unchecked")
	public ArrayQueue() {
		queue = (E[]) new Object[DEFAULT_CAPACITY];
		front = 0;
		tail = queue.length - 1;
		numItems = 0;
	}

	@SuppressWarnings("unchecked")
	public ArrayQueue(final int capacity) {
		queue = (E[]) new Object[capacity];
		front = 0;
		tail = queue.length - 1;
		numItems = 0;
	}

	@Override
	public void enqueue(final E newItem) {
//		if(isfull()) {
//			//에러처리
//		} else {
//			tail = (tail + 1) % queue.length;
//			queue[tail] = newItem;
//			numItems++;
//		}
		if (isfull()) {
			// 에러처리
			/* System.out.println("큐가 가득찼습니다."); */
			
			// 위처럼 out으로 하게 되면 오류같지 않기 때문에 java에서는 err로 써 주는 것이 좋다.
			System.err.println("큐가 가득찼습니다.");
			return;
		}
		tail = (tail + 1) % queue.length;
		queue[tail] = newItem;
		numItems++;
	}

	private boolean isfull() {
		return numItems == queue.length;
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		}

		E queueFront = queue[front];
		front = (front + 1) % queue.length;
		numItems--;

		return queueFront;
	}

	@Override
	public E front() {
		if (isEmpty()) {
			return null;
		}

		return queue[front];
	}

	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	@Override
	public void dequeueAll() {
		front = 0;
		tail = queue.length - 1;
		numItems = 0;
	}
}
