package ch_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_5 {

	public static void main(String[] args) {
		
//		Collection c = new ArrayList();
		Collection c = new HashSet(); // List�� Set�� ���� �������̽��� Collection���� type�� ���� �� �� ������
		
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		

	}

}
