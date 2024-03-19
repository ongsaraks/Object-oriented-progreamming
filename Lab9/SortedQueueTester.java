import java.util.Arrays;

public class SortedQueueTester {
	
	public static void testInteger() {
		int[] nums = new int[]{30, 10, 20, 45, 21, 11, 90, 2};
		SortedQueue<Integer> myQueue = new SortedQueue<>();
		for(int n: nums)
		{	StringBuilder str = new StringBuilder();
			if(myQueue.enqueue(n) == true)
			{
				str.append("Enqueuing ");
			}
			else
			{
				str.append("Sorted Queue Full:"+Arrays.toString(myQueue.toArray())
					+" The first element is "+myQueue.toString()+". Cannot enqueue ");
			}
			str.append(n+"\n"+myQueue.toString());
			System.out.println(str.toString());
		}
		
		for(int i = 0; i < nums.length; i++)
		{	StringBuilder str = new StringBuilder();
			Integer n = null;
			if((n = myQueue.dequeue()) != null)
			{
				str.append("Dequeuing "+n.toString());
			}
			else
			{
				str.append("Sorted queue empty!");
			}
			str.append("\n"+myQueue.toString());
			System.out.println(str.toString());
		}

	}
	

	public static void testCharacter()
	{
		char[] cs = new char[]{'E', 'C', 'D', 'B', 'A', 'F'};
		SortedQueue<Character> myQueue = new SortedQueue<Character>(5);
		for(char c: cs)
		{	StringBuilder str = new StringBuilder();
			if(myQueue.enqueue(c) == true)
			{
				str.append("Enqueuing ");
			}
			else
			{
				str.append("Sorted Queue Full:"+Arrays.toString(myQueue.toArray())
					+" The first element is "+myQueue.peek().toString()+". Cannot enqueue ");
			}
			str.append(c+"\n"+myQueue.toString());
			System.out.println(str.toString());
		}
		
		for(int i = 0; i < cs.length; i++)
		{	StringBuilder str = new StringBuilder();
			Character c = null;
			if((c = myQueue.dequeue()) != null)
			{
				str.append("Dequeuing "+c.toString());
			}
			else
			{
				str.append("Sorted queue empty!");
			}
			str.append("\n"+myQueue.toString());
			System.out.println(str.toString());
		}
	}
	
	public static void testString()
	{
		String[] ss = new String[]{"Think?", "You", "Don't", "Cool", "is", "Java", "Oops!"};
		SortedQueue<String> myQueue = new SortedQueue<String>();
		for(String s: ss)
		{	StringBuilder str = new StringBuilder();
		if(myQueue.enqueue(s) == true)
		{
			str.append("Enqueuing ");
		}
		else
		{
			str.append("Sorted Queue Full:"+Arrays.toString(myQueue.toArray())
				+" The first element is "+myQueue.peek().toString()+". Cannot enqueue ");
		}
			str.append(s+"\n"+myQueue.toString());
			System.out.println(str.toString());
		}
		
		for(int i = 0; i < ss.length+1; i++)
		{	StringBuilder str = new StringBuilder();
			String s = null;
			if((s = myQueue.dequeue()) != null)
			{
				str.append("Dequeuing "+s.toString());
			}
			else
			{
				str.append("Sorted queue empty!");
			}
			str.append("\n"+myQueue.toString());
			System.out.println(str.toString());
		}
	}
	public static void main(String[] args)
	{
		
		testInteger();
		System.out.println("--------------------------------");

		testCharacter();
		System.out.println("--------------------------------");

		testString();
		System.out.println("--------------------------------");

		
	}
}
