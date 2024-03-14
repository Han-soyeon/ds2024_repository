package generic;

public class Box<E> {
	
	private E content;
	
	public void setContent(final E content) {
		this.content = content;
	}
	
	public E getContent() {
		return this.content;
	}
	
}
