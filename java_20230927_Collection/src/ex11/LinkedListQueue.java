package ex11;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
	
	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
//		Queue<String> queue = new LinkedTransferQueue<String>();
		
		queue.add("Toy");
		queue.add("Box");
		queue.add("Robot");
		queue.add("Toy");
		queue.add("Car");
		queue.add("Toy");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("------------------------------");
		
		for(String s:queue)
			System.out.println(s);
		System.out.println("------------------------------");
		
		for(String s:queue)
			System.out.println(s);
		System.out.println("------------------------------");
		
		System.out.println(queue.peek());
		System.out.println("------------------------------");

		for(String s:queue)
			System.out.println(s);
	}
	
}

