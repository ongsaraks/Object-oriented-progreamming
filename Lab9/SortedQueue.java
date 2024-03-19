
public class SortedQueue<T extends Comparable<T>> {
		int capacity;
<<<<<<< HEAD
		T[] store;
		ArrayList<T> queue = new ArrayList<T>();
=======
>>>>>>> parent of 291263a (Update SortedQueue.java)
	public SortedQueue() {
		this.capacity = 0;
	}
	public SortedQueue(int capacity) {
		this.capacity = capacity;
	}
	public boolean enqueue(T object) {
<<<<<<< HEAD
	
		if(queue.size()>= capacity) {
			return false;
		}
		queue.add(object);
		Collections.sort(queue);
		return true;
	
		
=======
		return false;
>>>>>>> parent of 291263a (Update SortedQueue.java)
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
<<<<<<< HEAD
		
		return "||" + toString() + "||" ;
    }
=======
		return null;
		
	}
>>>>>>> parent of 291263a (Update SortedQueue.java)
	
	
}
