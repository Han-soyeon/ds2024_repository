package expr;

import arrayStack.ArrayStack;

public class InfixPostfix {

	public static void main(String[] args) {
		//2. 수식을 사용자가 입력할 수 있도록 확장해주세요.
		String infix = "(32 + 5) * 4 + 10 / 5";
		String postfix = toPostfic(infix);//"32 + 5 * 4 + 10 / 5";
		int result = evaluate(postfix);
		System.out.println(result);

				
		// 후위 표기법
		//String positfix = "32 5 + 4 * 10 5 / +";
		//String positfix = "700 3 47 + 6 * - 4 /";
		/*int result = evaluate(positfix);*/
		
		/*System.out.println("Input string: " + positfix);
		System.out.println("Answer: " + result);*/

	}
	//1. toPostfix 함수 완성
	private static String toPostfic(String infix) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int evaluate(String positfix) {
		ArrayStack<Integer> stack = new ArrayStack<>();
		boolean digitPreviously = false;

		for (int i = 0; i < positfix.length(); i++) {
			char c = positfix.charAt(i);

			if (Character.isDigit(c)) {
				if (digitPreviously) {
					int value = stack.pop();
					// 0 = 3 * 10 + (2-0)
					value = value * 10 + (c - '0');
					// 32
					stack.push(value);

				} else {
					// int v = c - '0';
					// stack.push(v);
					// 두줄을 한줄로
					stack.push(c - '0');
				}
				digitPreviously = true;
			} else if (isOperator(c)) {
				// 연산할 때 숫자 두개 꺼내고 결과값 담을 result 선언
				int a = stack.pop();
				int b = stack.pop();
				int result = operation(b, a, c);
				
				// 스택에 결과값 담고 digitPreviously를 false로 변경해주기
				stack.push(result);
				digitPreviously = false;
				
			} else {
				//숫자 사이 공백 체크
				digitPreviously = false;
			}
		}
		return stack.pop();
	}

	private static int operation(int b, int a, char c) {
		switch (c) {
		case '+':
			return b + a;
		case '-':
			return b - a;
		case '*':
			return b * a;
		case '/':
			return b / a;
		}
		return 0;
	}

	static boolean isOperator(char c) {
		return c == '+' || c == '*' || c == '-' || c == '/' || c == '%';
	}

}
