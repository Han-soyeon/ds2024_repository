package binaryTree;

public class TreeNode<E> {
	E item;
	TreeNode<E> left;
	TreeNode<E> right;
	
	public TreeNode(final E newItem) {
		this.item = newItem;
		this.left = this.right = null;
	}
	
	// 트리 노드를 초기화할 생성자 생성
	public TreeNode(final E newItem, final TreeNode<E> left, final TreeNode<E> right) {
		this.item = newItem;
		this.left = left;
		this.right = right;
	}

	// 위의 생성자를 통해 트리를 만든

	// getter & setter

}
