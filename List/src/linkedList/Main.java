package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerLinkedList list = new IntegerLinkedList();
		
		list.add(0, 5);
		list.add(1, 8);
		list.add(2, 16);
		list.add(3,9);
		
		list.append(28);
		list.append(30);
		list.append(65);
		
		list.remove(0);
		
		list.removeItem(28);
		list.removeItem(16);
				
		list.printAll();

	}

}
