package ch_11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_8 {

	public static void main(String[] args) {
		
		Integer[] arr = {30, 50, 10, 40, 20};
		
		// Integer�� �������ִ� �⺻ ���ı��� CompareTo()�� ����
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// DescCompŬ������ compare()�� ����
		Arrays.sort(arr, new DescComp());
		System.out.println(Arrays.toString(arr));

	}

}

class DescComp implements Comparator{
	
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			
			Comparable n1 = (Comparable)o1;
			Comparable n2 = (Comparable)o2;
			
			// �⺻ ������ compareTo()�� �������� ����
			return n1.compareTo(n2) * -1;
		}
		return -1;
	}
	
}
