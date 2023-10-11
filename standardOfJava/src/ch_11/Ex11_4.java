package ch_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue�� �ִ� 5���� ����ǵ��� �Ѵ�.

	public static void main(String[] args) {

		System.out.println("help >> ����");
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

					System.out.println("help >> ����");
					System.out.println("q >> ����");
					System.out.println("history >> �ֱ� �˻���" + MAX_SIZE + "��");

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
				System.out.println("�Է¿���");
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
