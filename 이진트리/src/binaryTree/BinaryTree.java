package binaryTree;

public class BinaryTree<E> {
	TreeNode<E> root;

	public BinaryTree() {
		root = null;
	}

	// 처음 시작을 root로 하는 것을 생성자를 통해 하도록 구성
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	// 이진 트리 순회의 핵심코드 - 전위 순회
	void preOrder(final TreeNode<E> root) {
		// 재귀 함수는 종료 조건이 반드시 있어야 한다.
		// 전위 순회 - 재귀 알고리즘을 사용

		if (root == null) {
			return;
		}
		// 출력을 옆으로 나올 수 있도록 함(print)
		System.out.print(root.item); // V
		preOrder(root.right); // L
		preOrder(root.right); // R
	}
	
	public void inOrder() {
		preOrder(root);
		System.out.println();
	}

	// 이진 트리 순회의 핵심코드 - 중위 순회
	void inOrder(final TreeNode<E> root) {
		// 재귀 함수는 종료 조건이 반드시 있어야 한다.
		// 전위 순회 - 재귀 알고리즘을 사용

		if (root == null) {
			return;
		}
		// 출력을 옆으로 나올 수 있도록 함(print)
		preOrder(root.right); // L
		System.out.print(root.item); // V
		preOrder(root.right); // R
	}
	
	public void postOrder() {
		preOrder(root);
		System.out.println();
	}

	// 이진 트리 순회의 핵심코드 - 후위 순회
	void postOrder(final TreeNode<E> root) {
		// 재귀 함수는 종료 조건이 반드시 있어야 한다.
		// 전위 순회 - 재귀 알고리즘을 사용

		if (root == null) {
			return;
		}
		// 출력을 옆으로 나올 수 있도록 함(print)
		preOrder(root.right); // L
		preOrder(root.right); // R
		System.out.print(root.item); // V
	}
}
