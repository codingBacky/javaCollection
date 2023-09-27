package ex03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> iter = list.iterator();//반복자 획득
		String str;
		while(iter.hasNext()) {
			str = iter.next();
			if(str.equals("Box"))
				iter.remove();
			System.out.println(str);
		}//iter의 자리가 맨 뒤에 가 있음
		System.out.println("---------------------");
		iter = list.iterator();//다시 만들어서 위치를 처음으로 보내줘야 가져올수 있음
		while(iter.hasNext()) {
			str = iter.next();
			System.out.println(str);
		}
		
		List<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		
		Iterator<Integer> iter1 = list1.iterator();//반복자 획득
		int num;
		while(iter1.hasNext()) {
			num = iter1.next();
			if(num == 12)
				iter1.remove();
			System.out.println(num);
		}//iter의 자리가 맨 뒤에 가 있음
		System.out.println("---------------------");
		iter1 = list1.iterator();//다시 만들어서 위치를 처음으로 보내줘야 가져올수 있음
		while(iter1.hasNext()) {
			num = iter1.next();
			System.out.println(num);
		}
		
		
	}

}
