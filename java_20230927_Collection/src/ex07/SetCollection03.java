package ex07;

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
	
	@Override
	public int hashCode() {
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(num == ((Num)obj).num)
//			return true;
//		else
//			return false;
		return num == ((Num)obj).num ? true : false;
	}
}	
public class SetCollection03 {
	
	public static void main(String[] args) {
		
		Set<Num> set = new HashSet<>();
		set.add(new Num(9999));
		set.add(new Num(8888));
		set.add(new Num(7777));
		set.add(new Num(9999));
		
		Iterator<Num> iter = set.iterator();
	
		while(iter.hasNext())
			System.out.println(iter.next());	
	}
}

