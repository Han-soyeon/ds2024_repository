package common;

public interface QueueInterface<E> {
	
	public void enqueue(E newItem);
	
	public E dequeue();
	
	public E front();
	
	public boolean isEmpty();
	
	public void dequeueAll();
}
