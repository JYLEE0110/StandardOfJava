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
			
			// Hashing �˰��� ���� add�ÿ� ���ڰ� �����Ǿ� ����ȴ�.
			set.add(str);
			
		}
		System.out.println();
		// set�� ArrayList�������� ��ȯ �� shuffle
		// set�� ������ �������� �ʱ� ������ ���� �����ϴ� shuffle�� �� �� ����.
		List list = new ArrayList<>(set);
		Collections.shuffle(list);
		
		Iterator it = list.iterator();
		
		for(int i = 0; i< board.length; i++) {
			
			for(int j = 0; j < board[i].length; j++) {
				
				// it.next()��ȯ ���� Object�̹Ƿ� String���� ����ȯ �ؼ� ���� ������ �����Ѵ�.
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] <10 ? " " : " " ) + board[i][j]);
				
			}
			System.out.println();
			
		}

	}

}
