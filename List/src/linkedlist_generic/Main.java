package linkedlist_generic;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(0, 10);
		list.add(1, 20);
		list.add(2, 30);

		System.out.println(list.indexOf(10));
		
		list.append(40);
		list.append(50);

		list.remove(1);

		list.removeItem(40);

		list.printAll();
	}

}
