package binaryTree;

//BST...

public class BinarySearchTree<E> extends BinaryTree<E> implements IndexInterface<TreeNode<E>, E> {

	@Override
	public TreeNode<E> search(Comparable<E> x) { // 작성 순서 1번
		return searchItem(root, x);
	}

	private TreeNode<E> searchItem(TreeNode<E> t, Comparable<E> x) { // 작성 순서 0번
		if (t == null) {
			return null;
		}

//		if (x.compareTo(t.item) < 0) {
//			return searchItem(t.left, x);
//		} else if (x.compareTo(t.item) > 0) {
//			return searchItem(t.right, x);
//		} else {
//			return t;
//		}

		if (x.compareTo(t.item) == 0) {
			return t;
		} else if (x.compareTo(t.item) < 0) {
			return searchItem(t.right, x);
		} else {
			return searchItem(t.right, x);
		}
	}

	@Override
	public void insert(Comparable<E> x) {
		root = insertItem(root, x); // 1번째 값은 root가 null에서 변경되기 때문에 root 객체에 넣어주어야 한다.

	}

	// insert를 위한 재귀 펑션 따로 만들기
	private TreeNode<E> insertItem(TreeNode<E> t, Comparable<E> x) {
		if (t == null) { // 새로운 노드를 삽입할 자리를 찾음
			return new TreeNode<E>((E) x, null, null); // 새로운 노드 삽입을 위한 생성 - 해당 부분 new를 사용하도록 주의
		} else if (x.compareTo(t.item) < 0) {
			t.left = insertItem(t.left, x);
			return t;
		} else {
			t.right = insertItem(t.right, x);
			return t;
		}
	}

	@Override
	public void delete(final Comparable<E> x) {
		root = findAndDelete(root, x);
	}

	private TreeNode<E> findAndDelete(TreeNode<E> t, final Comparable<E> x) {
		if (t == null) {
			return null; // item not found!
		} else {
			if (x.compareTo(t.item) == 0) {
				t = deleteNode(t); // item found at t
			} else if (x.compareTo(t.item) < 0) {
				t.left = findAndDelete(t.left, x);
			} else {
				t.right = findAndDelete(t.right, x);
			}
			return t;
		}
	}

	private TreeNode<E> deleteNode(TreeNode<E> t) {
		if (t.left == null && t.right == null) {
			return null; // case 1 (no child)
		} else if (t.left == null) {
			return t.right; // case 2 (only right child
		} else if (t.right == null) {
			return t.left; // case 2 (only left child)
		} else { // case 3 (two children)
			returnPair rPair = deleteMinItem(t.right);
			t.item = (E) rPair.minItem;
			t.right = rPair.node;
			return t; // t survived
		}
	}

	private returnPair deleteMinItem(TreeNode<E> t) {
		if (t.left == null) { // found minimum at t
			return new returnPair(t.item, t.right);
		} else { // branch left, then backtrack
			returnPair rPair = deleteMinItem(t.left);
			t.left = rPair.node;
			rPair.node = t;
			return rPair;
		}
	}

	private class returnPair {
		E minItem;
		TreeNode<E> node;

		private returnPair(E x, TreeNode<E> t) {
			minItem = x;
			node = t;
		}
	}
}