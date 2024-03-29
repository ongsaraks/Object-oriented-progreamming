
// File: <Ongsa>
// Description: <Generic type of array>
// Lab: <9>
//
// ID: <6688093>
// Name: <Ongsa Raksalam>
// Section: 2
//
// On my honor, <Ongsa raksalam>, this project assignment is my own work
// and I have not provided this code to any other students.

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
	public static void testSong()
	{
			Song1[] arr = new Song1[5];
			arr[0] = new Song1("Taylor",5.5,"B");
			arr[1] = new Song1("Kanye",6.5,"B");
			arr[2] = new Song1("John",8.5,"B");
			arr[3] = new Song1("Adante",7.5,"B");
			arr[4] = new Song1("Kobe",9.5,"B");
			SortedQueue<Song1> myQueue = new SortedQueue<>();
			for(Song1 n: arr)
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
			
			for(int i = 0; i < arr.length; i++)
			{	StringBuilder str = new StringBuilder();
				Song1 n = null;
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
	public static void main(String[] args)
	{
		
		testInteger();
		System.out.println("--------------------------------");

		testCharacter();
		System.out.println("--------------------------------");

		testString();
		System.out.println("--------------------------------");

		testSong();
		System.out.println("--------------------------------");
	}
}
