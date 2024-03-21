import java.util.*;
public class SortedQueue<T extends Comparable<T>> {
		int capacity;
		ArrayList<T> queue;
	public SortedQueue() {	
		queue = new ArrayList<>();
		this.capacity = Integer.MAX_VALUE;
	}
	public SortedQueue(int capacity) {
		this.capacity = capacity;
		queue = new ArrayList<>(this.capacity);
	}
	public boolean enqueue(T object) {
		 if (queue.size() >= capacity) {
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
		return  queue.remove(0);
	
		

		
	}
	public T peek() {
		
		if(queue.isEmpty()) {
			return null;
		}
		return queue.get(0);


	}
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] array =  (T[])new Comparable[queue.size()];
        for (int i = 0; i < queue.size(); i++) {
            array[i] = (T) queue.get(i);
        }
		
        return array;

	}
	
	public String toString() {
		String str = "||";
		for(int i = 0; i < queue.size();i++) {
			str += queue.get(i);
		if(queue.size() > 1 && i < queue.size()-1) {
			str += "->";
		}
		}
		str+= "||";
		return str;
		}
		

		
	}
