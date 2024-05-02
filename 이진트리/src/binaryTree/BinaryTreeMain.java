package binaryTree;

public class BinaryTreeMain {

	public static int evaluate(final BinaryTree<Character> expression) {
		return evaluate(expression.root);
	}

	private static int evaluate(final TreeNode<Character> root) {
		if (root == null) {
			return 0;
		}
		int valueL = evaluate(root.left); // L
		int valueR = evaluate(root.right); // R

		// V
		int result = 0;

		switch (root.item) {
		case '+':
			result = valueL + valueR;
			break;
		case '*':
			result = valueL * valueR;
			break;
		case '/':
			result = valueL / valueR;
			break;
		case '-':
			result = valueL - valueR;
			break;
		default:
			result = Character.getNumericValue(root.item);
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode<Character> n1 = new TreeNode<>('3', null, null);
		TreeNode<Character> n2 = new TreeNode<>('2', null, null);
		TreeNode<Character> n3 = new TreeNode<>('5', null, null);
		TreeNode<Character> n4 = new TreeNode<>('6', null, null);
		TreeNode<Character> n5 = new TreeNode<>('*', n1, n2);
		TreeNode<Character> n6 = new TreeNode<>('+', n3, n4);
		TreeNode<Character> n7 = new TreeNode<>('+', n5, n6);

		BinaryTree<Character> binaryTree = new BinaryTree<>();
		binaryTree.root = n7;

		// 호출
		binaryTree.preOrder();
		binaryTree.inOrder();
		binaryTree.postOrder();

		// 응용 - 수식트리 호출
		System.out.println("수식의 결과는" + evaluate(binaryTree));
	}

}
