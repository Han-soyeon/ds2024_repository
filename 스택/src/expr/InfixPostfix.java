package expr;

import arrayStack.ArrayStack;

public class InfixPostfix {

	public static void main(String[] args) {
		// 2. 수식을 사용자가 입력할 수 있도록 확장해주세요.
		String infix = "A+B*C-D/E";
		String result = toPostfic(infix);
		
		System.out.println("Input string: " + infix);
		System.out.println("Answer: " + result);
		//System.out.println("Input string: " + postfix);
		//System.out.println("Answer: " + result);

		// 후위 표기법
		// String positfix = "32 5 + 4 * 10 5 / +";
		// String positfix = "700 3 47 + 6 * - 4 /";
		/* int result = evaluate(positfix); */

		/*
		 * System.out.println("Input string: " + positfix);
		 * System.out.println("Answer: " + result);
		 */
	}

	// 1. toPostfix 함수 완성
	private static String toPostfic(String infix) {
		//결과를 담을 문자열 선언
		StringBuilder postfix = new StringBuilder();
		// 연산자를 담을 스택 선언
		ArrayStack<Character> stack = new ArrayStack<>();
		
		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			// 연산자 이외에는 바로 출력
			if (Character.isDigit(ch)) {
				postfix.append(ch);
				while (i + 1 < infix.length() && Character.isDigit(infix.charAt(i + 1))) {
					postfix.append(infix.charAt(i + 1));
					i++;
				}
				postfix.append(' ');
			} else if (ch == '(') { //괄호가 나오면 스택에 넣는다.
				stack.push(ch);
			} else if (ch == ')') { //닫는 괄호가 나오면 여는 괄호가 나올때까지 출력큐에 넣어준다.
				while (!stack.isEmpty() && stack.top() != '(') {
					postfix.append(stack.pop()).append(' ');
				}
				stack.pop();
			} else if (isOperator(ch)) {
				// + - / * 연산자일 경우
				while (!stack.isEmpty() && precedence(ch) <= precedence(stack.top())) {
					postfix.append(ch);
				}
				stack.push(ch);
			}
		}
		// 스택에 있는 남은 연산자를 모두 꺼낸다.
		while (!stack.isEmpty()) {
			postfix.append(stack.pop()).append(' ');
		}
		return postfix.toString().trim();
	}
	
	static boolean isOperator(char c) {
		return c == '+' || c == '*' || c == '-' || c == '/' || c == '%';
	}

	private static int precedence(char ch) {
		if (ch == '(' || ch == ')') {
			return 0;
		} else if (ch == '+' || ch == '-') {
			return 1;
		} else if (ch == '*' || ch == '/') {
			return 2;
		}
		return -1;
	}
}
