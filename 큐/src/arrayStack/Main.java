package arrayStack;

public class Main {

	public static void main(String[] args) {
		ArrayStack<Integer> integerStack = new ArrayStack<>();

		integerStack.push(100);
		integerStack.push(200);
		integerStack.push(300);
		integerStack.printAll();

		System.out.println("----------------------------");
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println("----------------------------");

		ArrayStack<String> stringStack = new ArrayStack<>();
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
