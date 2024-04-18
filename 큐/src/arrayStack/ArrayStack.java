package arrayStack;

import common.StackInterface;

public class ArrayStack<E> implements StackInterface<E> {

	// 필요한 스택 구현
	private E[] stack;
	// topIndex값을 저장할 공간 구현
	private int topIndex;

	// 64개의 값을 넣어주는 오브젝트 구현
	private static final int DEFAULT_CAPACITY = 64;

	// 적절한 사이즈로 스택의 공간을 확보하기 위한 구현
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		stack = (E[]) new Object[DEFAULT_CAPACITY];
		topIndex = -1;
	}

	// 값을 매개변수로 넘기는 method
	@SuppressWarnings("unchecked")
	public ArrayStack(final int capacity) {
		stack = (E[]) new Object[capacity];
		topIndex = -1;
	}

	@Override
	public void push(E newItem) {
		if (isFull()) { // 에러처리
			// 값이 가득 차 있으면 return으로 값을 넣지 않는다.
			System.out.println("스택이 가득 찼습니다.");
			return;
		}
		// stack에 push로 값이 들어오면 인덱스를 추가하여 newItem에 넣는다
		// ++topIndex;
		// stack[++topIndex] = newItem;
		// 두줄로 사용할 수 있지만 아래처럼 한줄로 줄여 작성할 수 있다.
		stack[++topIndex] = newItem;
	}

	public boolean isFull() {
		// 값이 가득 차 있을 때가 길이-1 ex)100개를 채울 수 있다면 99개가 가득임
		return topIndex == stack.length - 1;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		}
		// E item = stack[topIndex];
		// topIndex--;
		// return item;
		// 세줄로 사용할 수 있지만 아래처럼 한줄로 줄여 작성할 수 있다.
		// 증감 연산시 --가 뒤에 있다면 연산이 나중에 수행된다.
		return stack[topIndex--];
	}

	@Override
	// 가장 맨 위의 값을 보기만 하는 메소드
	public E top() {
		if (isEmpty()) { // 에러처리
			// null값이 반환되면 값이 없다고 인식
			return null;
		}
		// 배열에 -1을 넣으면 에러가 나기 때문에 값이 가득 차있는지 안 차있는지 에러 처리를 해줘야함.
		return stack[topIndex];
	}

	@Override
	public boolean isEmpty() {
		return topIndex == -1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void popAll() {
		// 인덱스 값이 -1이면 접근할 수 없다
		topIndex = -1;
		// 아래 줄은 수행하지 않아도 문제 없다.
		// stack = (E[]) new Object[stack.length];
	}

	public void printAll() {
		for (int i = 0; i <= topIndex; i++) {
			System.out.println(stack[i]);
		}
	}
}
