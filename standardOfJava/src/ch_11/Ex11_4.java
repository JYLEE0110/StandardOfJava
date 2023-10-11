package ch_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개만 저장되도록 한다.

	public static void main(String[] args) {

		System.out.println("help >> 도움말");
		while (true) {

			System.out.print(">>");

			try {

				Scanner sc = new Scanner(System.in);
				String keyword = sc.nextLine().trim();

				if ("".equals(keyword)) {

					continue;

				}  
				
				if (keyword.equalsIgnoreCase("q")) {
				
					System.exit(0);
					
				} else if (keyword.equalsIgnoreCase("help")) {

					System.out.println("help >> 도움말");
					System.out.println("q >> 종료");
					System.out.println("history >> 최근 검색어" + MAX_SIZE + "개");

				}else if (keyword.equalsIgnoreCase("History")) {
					
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					
					for(int i = 0; i<SIZE; i++) {
						
						System.out.println((i+1) + "." + list.get(i));
						
					}
					
				}else {
					save(keyword);
				}

			} catch (Exception e) {
				System.out.println("입력오류");
			}

		}
		

	}
	static void save(String keyword) {
		
		if(!"".equals(keyword)){
			q.offer(keyword);
		}
		
		
		if(q.size() > MAX_SIZE) {
			q.poll();
		}
		
	}

}
