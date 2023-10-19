package ch_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2{
	
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
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
}

class BanNoAscending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Student2 && o2 instanceof Student2) {
			
			
			Student2 s1 = (Student2)o1;
			Student2 s2 = (Student2)o2;
			
			// comparTo로 비교
			return s1.ban == s2.ban ? (s1.no - s2.no) : s1.ban-s2.ban;
			
		}else {
			return -1;
		}
		
	}
}

public class Exercise11_4 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Student2("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student2("남궁성", 1, 1, 100, 100, 100));
		list.add(new Student2("김자바", 1, 2, 100, 100, 100));
		list.add(new Student2("이자바", 2, 1, 100, 100, 100));
		list.add(new Student2("안자바", 2, 2, 100, 100, 100));
		
		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
