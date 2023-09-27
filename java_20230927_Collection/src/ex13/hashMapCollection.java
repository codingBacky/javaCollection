package ex13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMapCollection {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(45, "Toy1");
		map.put(45, "Robot");
		map.put(35, "Box2");
		map.put(15, "Toy");
		map.put(15, "Toy2");
		map.put(40, "Box1");
		map.put(45, "Toy3");
		
		System.out.println(map.get(45));
		System.out.println(map.get(35));
		System.out.println(map.get(15));
		System.out.println(map.get(40));
		System.out.println("----------------");
		
		Set<Integer> keySet = map.keySet();
		
		for(int i:keySet)
			System.out.println(i);
		System.out.println("----------------");
		
		for(int i:keySet)
			System.out.print(map.get(i) + " ");
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext())
			System.out.println(map.get(iter.next()));
	}
	
}

