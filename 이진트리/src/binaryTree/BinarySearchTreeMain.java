package binaryTree;

import java.util.Scanner;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();

		while (true) {
			String input = scanner.next();
			if (input.equals("exit")) {
				break;
			}
			int value = Integer.parseInt(input);
			bst.insert(value);
		}
		bst.inOrder(); // 트리에 어떤 값이 들어있는지 출력 - 오름차순으로 출력됨

		System.out.print("찾고 싶은 값을 입력하세요: ");
		int searchKey = scanner.nextInt();
		TreeNode<Integer> result = bst.search(searchKey);

		if (result == null) {
			System.out.println("찾고 싶은 값이 없어요");
		} else {
			System.out.println("값을 찾았어요: " + result.item);
		}
		
		System.out.println("삭제하고 싶은 값을 입력하세요: ");
		int deleteKey = scanner.nextInt();
		bst.delete(deleteKey);
		
		bst.inOrder();
		
		scanner.close();
	}

}
