package ch_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exercise11_6 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		int[][] board = new int[5][5];
		
		for(int i = 0; set.size() < 25; i++) {
			
			String str = (int)(Math.random()*30) + 1 + "";
			
			System.out.print(str + " ");
			
			// Hashing 알고리즘에 의해 add시에 숫자가 고정되어 저장된다.
			set.add(str);
			
		}
		System.out.println();
		// set을 ArrayList형식으로 변환 후 shuffle
		// set은 순서를 유지하지 않기 때문에 순서 변경하는 shuffle을 쓸 수 없다.
		List list = new ArrayList<>(set);
		Collections.shuffle(list);
		
		Iterator it = list.iterator();
		
		for(int i = 0; i< board.length; i++) {
			
			for(int j = 0; j < board[i].length; j++) {
				
				// it.next()반환 값은 Object이므로 String으로 형변환 해서 정수 형으로 저장한다.
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] <10 ? " " : " " ) + board[i][j]);
				
			}
			System.out.println();
			
		}

	}

}
