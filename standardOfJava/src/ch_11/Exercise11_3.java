package ch_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable{
	
	private String name;
	private int ban;
	private int no;
	private int kor, eng, math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	@Override
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," +getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Object o) {
		
		int result;
		
		if(o instanceof Student) {
			
			Student tmp = (Student)o;
			
			return this.name.compareTo(tmp.name);

		}else {
			return -1;
		}
		
	}
	
	
	
}

public class Exercise11_3 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 100, 100, 100));
		list.add(new Student("김자바", 1, 1, 100, 100, 100));
		list.add(new Student("이자바", 1, 1, 100, 100, 100));
		list.add(new Student("안자바", 1, 1, 100, 100, 100));
		
		// list에 저장된 객체의 기본 인터페이스인 comparable compareTo의 정렬을 따른다.
		Collections.sort(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
