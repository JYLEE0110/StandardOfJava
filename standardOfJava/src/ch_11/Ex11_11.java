package ch_11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));

		System.out.println(set);
		
	}

}

class Person{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public String toString() {
		return name + ":" + age;
	}
	
	// set�� �ߺ��� �Ұ��� ������ ���δٸ� ��ü�� ��� �ּҰ��� �ٸ��ٰ� �ν��Ͽ� add�� �����ϰԵȴ�.
	// equals�� hashcode�� Override �� ��ü ���� �����͸� �˻��Ѵ�.
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		
		return name.equals(p.name) && age == p.age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
}
