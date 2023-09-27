package ex09;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
class Person{
	private String name;
	private int age;
	
	@Override
	public int hashCode() {
		return (name.hashCode() + age%10)/2;
	}
	@Override
	public boolean equals(Object obj) {
		String _name = ((Person)obj).name;
		int _age = ((Person)obj).age;
		return name.equals(_name) && age == _age ? true : false;
	}
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}
public class SetCollecExam01 {
	
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("조조", 20));
		set.add(new Person("조조", 30));
		set.add(new Person("조조", 20));
		set.add(new Person("유비", 27));
		set.add(new Person("유비", 27));
		
		for(Person p:set)
			System.out.println(p);
	}
	
}

