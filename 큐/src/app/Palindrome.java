package app;

import java.util.Scanner;

import arrayStack.ArrayStack;
import common.QueueInterface;
import common.StackInterface;
import linkedqueue.LinkedQueue;

public class Palindrome {

	public static void main(String[] args) {
		// 문자열을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		boolean result = isPalindrome(inputString);

		if (result) {
			System.out.println(result);
			System.out.println("좌우동형 문자열이 맞습니다.");
		} else {
			System.out.println("좌우동형 문자열이 아닙니다.");
		}
	}

	private static boolean isPalindrome(final String inputString) {
		// 1. inputString을 저장할 스택과 큐를 생성합니다.
		StackInterface<Character> stack = new ArrayStack<>();
		QueueInterface<Character> queue = new LinkedQueue<>();

		// 2. inputString의 각 문자를 스택과 큐에 추가합니다.
		for (int i = 0; i < inputString.length(); i++) {
			stack.push(inputString.charAt(i));
			queue.enqueue(inputString.charAt(i));
		}
		// 3. 스택과 큐의 원소를 하나씩 꺼내서 비교합니다.
		while (!queue.isEmpty() && stack.pop() == queue.dequeue()) {
			// 일시적으로 사용하는 변수는 선언하지 않고 바로 if에 대입하여 사용하는게 좋다.
			//if(!queue.dequeue().equals(stack.pop())) <<이렇게
			Character a = queue.dequeue();
			Character b = stack.pop();
			
			if(!a.equals(b)) {
				break;
			}
		}
		// 4. 스택과 큐가 모두 비어있다면 참, 그렇지 않으면 거짓
		if (queue.isEmpty() && stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
