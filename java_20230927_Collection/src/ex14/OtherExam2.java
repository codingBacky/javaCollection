package ex14;

import java.util.Arrays;

public class OtherExam2 {
	
	public static void main(String[] args) {
		int[] ar = {1,7,8,2,7,8,4,9};
		
		for(int i:ar)
			System.out.print(i+" ");
		System.out.println();
		System.out.println();

		Arrays.sort(ar);
		for(int i:ar)
			System.out.print(i+" ");
		System.out.println();
		System.out.println();
		
		String[] str = {"Box","Toy","toy","Robot","box","robot"};
		Arrays.sort(str);
		for(String s:str)
			System.out.print(s+" ");
		
	}
	
}

