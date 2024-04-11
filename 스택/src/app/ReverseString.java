package app;

import common.StackInterface;
import linkedStack.LinkedStack;

public class ReverseString {
	// 문자열 뒤집는 기존 메소드 - 간단하게 구현할 때 적합
	private static String revers(String s) {
		StackInterface<Character> stack = new LinkedStack<>();

		for (int i = 0; i < s.length(); i++) {
			// charAt은 문자열에 있는 메소드로 문자열의 i번째 값을 꺼내다라는 뜻임
			stack.push(s.charAt(i)); // s의 번 문자. 번호는 0번부터
		}
		// 초기 문자열 - 문자열 공백으로 초기화
		String output = "";
		// 스택이 비어있지 않을 때까지 값을 꺼내기
		// output은 초기 문자열인 ""+T를 가져오고 기존의 output과의 연결은 사라진다.
		// 이 과정이 문자열만큼 반복된다.(문자열이 새로 만들어지는 개념이다.)
		while (!stack.isEmpty()) {
			output += stack.pop();
		}
		return output;
	}

	// StringBuilder를 사용하여 문자열 뒤집는 메소드 변경 - 복잡하거나 많은 문자열일 경우 사용
	private static String revers02(String s) {
		StackInterface<Character> stack = new LinkedStack<>();

		for (int i = 0; i < s.length(); i++) {
			// charAt은 문자열에 있는 메소드로 문자열의 i번째 값을 꺼내다라는 뜻임
			stack.push(s.charAt(i)); // s의 번 문자. 번호는 0번부터
		}
		StringBuilder builder = new StringBuilder();
		while (!stack.isEmpty()) {
			builder.append(stack.pop());
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		//String input = "Test Seq 12345"; // 테스트 입력 문자열
		String input = "홍길홍";
		
		System.out.println("Input string: " + input);
		// String answer = revers(input);
		String answer = revers02(input);
		System.out.println("Reversed string: " + answer);
		
		System.out.println(input.equals(answer));
	}

}
