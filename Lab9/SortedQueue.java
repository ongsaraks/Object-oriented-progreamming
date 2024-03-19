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
		queue.add(object);
		if(capacity < queue.size()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public T dequeue() {
		return null;
		
	}
	public T peek() {
		if(queue.size() >= 0) {
			return queue.get(0);
		}
		return null;
		
		
	}
	public T[] toArray() {
		return null;
		
	}
	public String toString() {
		
		return "||" + toString() + "||" ;
		
	}
	
	
}
