package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		
		for(String s:set)
			System.out.println(s);
		System.out.println("---------------------");
		
		Iterator<String> iter = set.iterator();//반복자 획득
		String str;
		while(iter.hasNext()) {
			str = iter.next();
			if(str.equals("Box"))
				iter.remove();
			System.out.println(str);
		}//iter의 자리가 맨 뒤에 가 있음
		System.out.println("---------------------");
		iter = set.iterator();//다시 만들어서 위치를 처음으로 보내줘야 가져올수 있음
		while(iter.hasNext()) {
			str = iter.next();
			System.out.println(str);
		}
		
					
	}

}
