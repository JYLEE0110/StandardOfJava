package ch_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

	public static void main(String[] args) {
		
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i = 0; i<objArr.length; i++) {
			
			set.add(objArr[i]);
			
		}

		System.out.println(set);
		
		// List, set은 Collection을 상위인터페이스로 두고 있고 Collection은 iterator를 상속받고 있다.
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
