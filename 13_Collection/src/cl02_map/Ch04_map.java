package cl02_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ch04_map {

	public static void main(String[] args) {
		//키 중복 불가, 값으 가능
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "집에");
		map.put(2, "가고");
		map.put(3, "싶다");
		
		System.out.println(map);
		
		Map<String,Double> map2 = new HashMap<String,Double>();
		
		map2.put("season", 523.22);
		map2.put("of", 23.55);
		map2.put("lovv", 9997.97);
		
		System.out.println(map2);
		System.out.println(map2.get("of"));
		map2.remove("of");
		System.out.println(map2);
		map2.clear();
		System.out.println(map2);
		
		mapPrint(map);
	}

	static void mapPrint(Map<Integer,String> map) {
		Set<Integer> Ketset = map.keySet();
		Iterator<Integer> keyIterator = Ketset.iterator();
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			String value = map.get(key);
			System.out.println( key + ":" + "value");
		}
	}
	
}
