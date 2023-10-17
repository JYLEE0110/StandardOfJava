package ch_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11_19 {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();

		System.out.println(list);
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		// 오른쪽으로 두 칸씩 이동
		Collections.rotate(list, 2);
		System.out.println(list);
		
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		// 이진 탐색으로 3이 저장된 index를 찾음
		int idx = Collections.binarySearch(list,3);
		System.out.println("Index Of 3 = " + idx);
		
		System.out.println("max = " + Collections.max(list));
		System.out.println("min = " + Collections.min(list));
		System.out.println("min = " + Collections.max(list, Collections.reverseOrder()));
		
		Collections.fill(list, 9);
		System.out.println(list);
		
		// list의 사이즈 만큼 생성 후 2로 채운다,
		List newList = Collections.nCopies(list.size(), 2);
		System.out.println(newList);
		
		boolean result = Collections.disjoint(list, newList);
		System.out.println(result);
		
		Collections.copy(list, newList);
		System.out.println(list);
		
		Collections.replaceAll(list, 2, 1);
		
		System.out.println(list);
		
		
	}

}
