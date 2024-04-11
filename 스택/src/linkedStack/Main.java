package linkedStack;

public class Main {

	public static void main(String[] args) {
		LinkedStack<Integer> integerStack = new LinkedStack<>();

		integerStack.push(100);
		integerStack.push(200);
		integerStack.push(500);
		integerStack.printAll();

		System.out.println("----------------------------");
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println("----------------------------");

		LinkedStack<String> stringStack = new LinkedStack<>();
		stringStack.push("Spring");
		stringStack.push("Summer");
		stringStack.push("Fall");
		stringStack.push("Winter");

		String stringItem;
		while ((stringItem = stringStack.pop()) != null) {
			System.out.println(stringItem);
		}
	}

}
