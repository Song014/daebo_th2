package ex01.collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public boolean equals(Object obj) { // 객체 주소 비교해서 처음에는 false가 맞고 오버라이드해서
		if (obj instanceof Person) {
			Person temp =(Person) obj;
			return name.equals(temp.name) ; // name = 송기석 temp 송기석
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return name.hashCode() + age;
	}
	
	
}

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("송기석", 29));
		set.add(new Person("김달리", 20));
		set.add(new Person("김달리", 20));
		set.add(new Person("김달리", 20));
		set.add(new Person("겨기석", 45));
		set.add(new Person("교기석", 60));

		System.out.println(set);
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
