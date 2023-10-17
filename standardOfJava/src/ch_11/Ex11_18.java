package ch_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_18 {

	public static void main(String[] args) {
		
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		HashMap map = new HashMap<>();
		
		for(int i = 0; i < data.length; i++) {
			
			if(!map.containsKey(data[i])) {
				map.put(data[i],1);
			}else {
				map.put(data[i], (int)map.get(data[i])+1);
			}
		}
		
		// map을 set으로 변환
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
