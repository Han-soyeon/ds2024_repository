package arrayList_generic2;

import commmon.ListInterface;

public class ArrayList<E> implements ListInterface<E> {

	private static final int Default_capacity = 64;

	private E[] items;
	private int numItems;

	@SuppressWarnings("unchecked")
	public ArrayList() {
		this.items = (E[]) new Object[Default_capacity];
		this.numItems = 0;
	}

	@SuppressWarnings("unchecked")
	public ArrayList(final int capacity) {
		this.items = (E[]) new Object[capacity];
		this.numItems = 0;
	}

	@Override
	public void add(int k, final E x) {

		if (k < 0 || k > numItems) {
			return;
		}

		// numItems >= items.length <<이부분 버그
		if (numItems >= items.length) {
			increasCapacity();
		}

		for (int i = numItems - 1; i >= k; i--) {
			items[i + 1] = items[i]; // 우시프트, right shift (add의 핵심 코드)
		}

		items[k] = x; // k번째 자리에 값 넣기
		numItems++; // 원소가 추가 되었기 때문에 numItems를 추가해주어야한다.
	}

	@SuppressWarnings("unchecked")
	private void increasCapacity() {
		E[] newItems = (E[]) new Object[items.length * 2];
		for(int i=0; i<numItems; i++) {
			newItems[i] = items[i];
		}
		items = newItems;
	}

	@Override
	public void append(final E x) {
		if (numItems >= items.length) {
			System.out.println("용량을 초과했습니다.");
			increasCapacity();
		}

		// 3가지 중 하나로 코드 작성 하면 됨
		// items[numItems] = x;
		// numItems++
		items[numItems++] = x;
	}

	@Override
	public E remove(final int k) {
		if (isEmpty() || k < 0 || k > numItems - 1) {
			System.out.println("리스트가 비었거나, 인덱스가 잘못되었습니다.");
			return null;
		}

		final E tmp = items[k];

		for (int i = k; i < numItems - 1; i++) {
			items[i] = items[i + 1];
		}
		numItems--;
		return tmp;
	}

	@Override
	public boolean removeItem(final E x) {

		int k = 0;
		while (k < numItems && !items[k].equals(x))
			k++;
		if (k == numItems) {
			return false;
		} else {
			for (int i = k; i < numItems - 2; i++) {
				items[i] = items[i + 1];
			}
			numItems--;
			return true;
		}
	}

	@Override
	public E get(final int k) {
		if (k >= 0 && k <= numItems - 1) {
			return items[k];
		} else {
			return null;
		}
	}

	@Override
	public void set(final int k, final E x) {
		if (k >= 0 && k <= numItems - 1) {
			items[k] = x;
		} else {
			System.out.println("인덱스가 잘못되었습니다.");
		}
	}

	@Override
	public int indexOf(final E x) {
		int i = 0;
		while (i < numItems && items[i].equals(x)) {
			i++;
		}
		if (i == numItems) {
			return -1;
		}
		return i;
	}

	@Override
	public int size() {
		return numItems;
	}

	@Override
	public boolean isEmpty() {
		/*
		 * if(numItems == 0) { return true; } else { return false; }
		 */

		// 위의 코드를 아래의 한줄로 변경할 수 있다.
		return numItems == 0;
	}

	@Override
	public void clear() {
		numItems = 0;
	}

	@Override
	public void printAll() {
		for (int i = 0; i < numItems; i++) {
			System.out.println(items[i]);
		}
	}
}
