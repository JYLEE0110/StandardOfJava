package ch_11;

import java.util.HashSet;

class SutdaCard{
	
	String name;
	int num;
	boolean isKwang;

	SutdaCard(){
		this("이주용", 1, true);
	}

	public SutdaCard(String name, int num, boolean isKwang) {
		this.name = name;
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//equals도 같고 hashCode도 같을때 중복
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

		SutdaCard c1 = new SutdaCard("김동현", 3, true);
		SutdaCard c2 = new SutdaCard("김동현", 3, true);
		SutdaCard c3 = new SutdaCard("이주용", 1, true);
		
		HashSet set = new HashSet();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
		
	}

}
