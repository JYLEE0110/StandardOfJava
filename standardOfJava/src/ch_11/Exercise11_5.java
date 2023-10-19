package ch_11;

import java.util.HashSet;

class SutdaCard{
	
	String name;
	int num;
	boolean isKwang;

	SutdaCard(){
		this("���ֿ�", 1, true);
	}

	public SutdaCard(String name, int num, boolean isKwang) {
		this.name = name;
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//equals�� ���� hashCode�� ������ �ߺ�
	public boolean equals(Object obj) {
		
		if(obj instanceof SutdaCard) {
			
			SutdaCard c = (SutdaCard)obj;
			
			return name.equals(c.name) && num == c.num && isKwang == c.isKwang;
			
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {

		return toString().hashCode();
	}
	
	public String toString() {
		return name + num + (isKwang ? "K" : "");
	}

	
}

public class Exercise11_5 {

	public static void main(String[] args) {

		SutdaCard c1 = new SutdaCard("�赿��", 3, true);
		SutdaCard c2 = new SutdaCard("�赿��", 3, true);
		SutdaCard c3 = new SutdaCard("���ֿ�", 1, true);
		
		HashSet set = new HashSet();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
		
	}

}
