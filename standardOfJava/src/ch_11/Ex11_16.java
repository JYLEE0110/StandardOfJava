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
			
			System.out.print("아이디 : ");
			String id = sc.nextLine().trim();

			System.out.print("비밀번호 : ");
			String pw = sc.nextLine().trim();

			if (!map.containsKey(id)) {
				System.out.println("존재하는 아이디가 없습니다.");
				continue;
			}
			
			if(pw.equals(map.get(id))) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("비밀번호가 틀림!!");
				
			}
			
		}
	}

}
