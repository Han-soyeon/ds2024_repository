package binaryTree;

public interface IndexInterface<T, E> {
	//Comparable << 들어오는 값이 비교가능하다 라는 뜻
	public void insert(Comparable<E> x);	//인터페이스 핵심 데이터타입 - 삽입
	public T search(Comparable<E> x);		//인터페이스 핵심 데이터타입 - 검색
	public void delete(Comparable<E> x);	//인터페이스 핵심 데이터타입 - 삭제
	
	
}
