import java.util.*;
public class SortedQueue<T extends Comparable<T>> {
		int capacity;

		T[] store;
		ArrayList<T> queue = new ArrayList<T>();

	public SortedQueue() {
		this.capacity = 0;
	}
	public SortedQueue(int capacity) {
		this.capacity = capacity;
	}
	public boolean enqueue(T object) {

	
		if(queue.size()>= capacity) {
			return false;
		}
		queue.add(object);
		Collections.sort(queue);
		return true;
	
		

	}
	public T dequeue() {
		return null;
		
	}
	public T peek() {
		return null;
		
		
	}
	public T[] toArray() {
		 if (queue.isEmpty()) {
	            return null; // Queue is empty
	        }
	        return (T[]) queue.toArray(); 
		
	}
	public String toString() {

		
		return "||" + toString() + "||" ;
    

		
	}
	
	
}
