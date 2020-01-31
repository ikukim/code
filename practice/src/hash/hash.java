package hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hash {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("kim",1);
		map.put("lee",2);
		map.put("you",3);
		
		Set<String> keys=map.keySet();
		for(String s:keys) {
			System.out.println(s);
		}
		
		Collection<Integer> values=map.values();
		for(int s:values) {
			System.out.println(s);
		}
		
		for(Map.Entry<String,Integer> e : map.entrySet()) {
			String key=e.getKey();
			int	value=e.getValue();
			System.out.println(key+"-"+value);
		}
		
	}
}
