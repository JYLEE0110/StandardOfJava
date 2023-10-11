package ch_11;

import java.util.Stack;

public class Ex11_3 {

	public static void main(String[] args) {

		Stack st = new Stack();

		String expression = "((3+5)*5)";

		try {
			for (int i = 0; i < expression.length(); i++) {

				if (expression.charAt(i) == ('(')) {

					st.push('(');

				} else if (expression.charAt(i) == (')')) {

					st.pop();
				}

			}
			if (st.isEmpty()) {
				System.out.println("������ ��ȣ�� ��ġ �մϴ�.");
			} else {

				System.out.println("������ ��ȣ�� �� ��ġ �մϴ�.");
			}

		} catch (Exception e) {
			System.out.println("���� �߻�");
		}

	}
}
