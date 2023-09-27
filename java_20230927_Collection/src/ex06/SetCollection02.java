package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class Num{
	private int num;
	public Num(int num) {this.num = num;}
	@Override
	public String toString() {
		return String.valueOf(num); //num+""
	}
}	
public class SetCollection02 {
	
	public static void main(String[] args) {
		
		Set<Num> set = new HashSet<>();
		set.add(new Num(9999));
		set.add(new Num(8888));
		set.add(new Num(7777));
		set.add(new Num(6666));
		
		Iterator<Num> iter = set.iterator();
	
		while(iter.hasNext())
			System.out.println(iter.next());	
	}
}

