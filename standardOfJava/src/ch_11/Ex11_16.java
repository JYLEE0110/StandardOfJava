package ch_11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {

		HashMap map = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		map.put("aaa", "1234");
		map.put("bbb", "1111");
		map.put("aaa", "2222");

		while (true) {
			
			System.out.print("���̵� : ");
			String id = sc.nextLine().trim();

			System.out.print("��й�ȣ : ");
			String pw = sc.nextLine().trim();

			if (!map.containsKey(id)) {
				System.out.println("�����ϴ� ���̵� �����ϴ�.");
				continue;
			}
			
			if(pw.equals(map.get(id))) {
				System.out.println("�α��� ����");
				break;
			}else {
				System.out.println("��й�ȣ�� Ʋ��!!");
				
			}
			
		}
	}

}
