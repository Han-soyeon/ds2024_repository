package recursion;

public class HanoiTower {
	
	static void move(int n, char a, char b, char c) {
		
		//재귀의 경계 조건(종료 조건)
		//재귀함수는 종료 조건을 필수로 작성해야한다.
		if(n <= 0) {
			return;
		}
			move(n-1, a, c, b);
			System.out.println(a+"에 있는 원반" + n + "을 " + c + "로 옮깁니다.");
			move(n-1, b, a, c);	
	}
	

	public static void main(String[] args) {
		
		//move(3, 'A', 'B', 'C');
		move(5, 'A', 'B', 'C');
		//move(8, 'A', 'B', 'C');

	}

}
