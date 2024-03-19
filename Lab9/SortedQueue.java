import java.util.*;
public class SortedQueue<T extends Comparable<T>> {
		int capacity;
		ArrayList<T> queue = new ArrayList<T>();
	public SortedQueue() {
		this.capacity = 0;
	}

	public SortedQueue(int capacity) {
		this.capacity = capacity;
	}
	public boolean enqueue(T object) {
	
		if(queue.size() > capacity) {
			return false;
		}
			queue.add(object);
			Collections.sort(queue);
			return true;
	}
	@SuppressWarnings("unchecked")
	public T dequeue() {
		queue.remove(0);
		return (T) queue;
		
	}
	public T peek() {
		if(queue.size() >= 0) {
			return queue.get(0);
		}
		return null;
		
	}
	public T toArray() {
		if(queue.isEmpty()) {
			return null;
		}
		
	}
	
	public String toString() {
		
		return "||" + queue + "||" ;
		
	}
}