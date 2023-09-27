package ex14;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return name + "(" + age +")";
	}
}

public class OtherExam3 {
	
	public static void main(String[] args) {
		
		Person[] persons = {new Person("조조",20), new Person("유비",30), new Person("관우",35)};
		
		Arrays.sort(persons);//기본 자료형이 아니면 sort 할 수 없다.
		for(Person p:persons)
			System.out.println(p);
		
	}
	
}

