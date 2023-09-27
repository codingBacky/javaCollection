package ex10;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {
	
	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(10);
		treeSet.add(10);		
		treeSet.add(7);
		treeSet.add(3);
		
		for(int n:treeSet)
			System.out.println(n);
		
	}
	
}

