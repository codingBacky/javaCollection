package ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherExam1 {
	
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);//추가 가능
		
		int[] intNum = new int[5];
		int[] intNum2 = {10,20,30,40};
		
		List<Integer> list2 = Arrays.asList(10,20,30,40,50);
		
		for(int i:list2)
			System.out.print(i + " ");
		
		List<String> list3 = Arrays.asList("Toy","Box","Robot");
		
		for(String str:list3)
			System.out.print(str + " ");
		System.out.println("--------------------");
		
//		list3.add("Box");//이렇게는 데이터 추가로 넣지 못한다.
		List<String> list4 = new ArrayList<String>(list3);
		list4.add("Box");
		list4.add("Robot");
		
		for(String str:list4)
			System.out.print(str + " ");

	
	
	
	}
	
}

