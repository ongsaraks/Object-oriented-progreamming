import java.util.*;
public class SortedQueue<T extends Comparable<T>> {
		int capacity;
		ArrayList<T> queue;
	public SortedQueue() {
		queue = new ArrayList<>();
	}
	public SortedQueue(int capacity) {
		this.capacity = capacity;
		queue = new ArrayList<>(capacity);
	}
	public boolean enqueue(T object) {
		if(queue.size() >= this.capacity) {
			return false;
		}
		queue.add(object);
		Collections.sort(queue);
		return true;
	

	}
	public T dequeue() {
		if(queue.isEmpty()) {
			return null;
		}
		queue.remove(0);
		return queue.get(0);

		
	}
	public T peek() {
		
		if(queue.isEmpty()) {
			return null;
		}
		return queue.get(0);


	}
	public T[] toArray() {
		return null;

	}
	
	public String toString() {
		return null;

		
	}
}