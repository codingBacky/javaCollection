package ex12;

import java.util.Stack;

public class LinkedListQueue {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(11);
		stack.push(9);
		stack.push(10);
		stack.push(10);
		stack.push(15);
		
		stack.pop();
		System.out.println("-----------------");
		
		for(int i:stack)
			System.out.println(i);
		
		stack.pop();
		System.out.println("-----------------");
		
		for(int i:stack)
			System.out.println(i);
	}
	
}

