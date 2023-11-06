package cl02_map;

import java.util.*;
import java.util.Map.Entry;

public class Ch06_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<>();
		
		score.add(13);
		score.add(57);
		score.add(11);
		score.add(17);
		score.add(19);	
	
		System.out.println("가장 낮은 점수 : "+score.first());
		System.out.println("가장 높은 점수 : "+score.last());
		System.out.println("50점 바로 아래 점수 : "+score.lower(50));
		System.out.println("50점 바로 위 점수 : "+score.higher(50));
		System.out.println("30점과 동일하거나 바로 아래 점수 : "+score.floor(30));
		System.out.println("30점과 동일하거나 바로 위 점수 : "+score.ceiling(30));
		
		//매개변수(점수, 본인포함여부(true or false))
		System.out.println("19점보다 낮은 점수들 : "+ score.headSet(19)); //기본값 false
		System.out.println("19점보다 큰 점수들 : "+ score.tailSet(19)); //기본값 true
		System.out.println("17~57점 사이의 점수들 : "+score.subSet(17, 57)); //기본값 true,false
		System.out.println("17~57점 사이의 점수들 : "+score.subSet(17,false, 57,true));
		
		System.out.println(score);
		System.out.println("가장 낮은 점수 삭제 : "+score.pollFirst());
		System.out.println(score);
		System.out.println("가장 높은 점수 삭제 : "+score.pollLast());
		System.out.println(score);
		
		
		///////////////////////////////////////////////////////
		System.out.println("--------------------------");
		int[] arrInt = {1,5,10,1,2,5,73,10,4,34};
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(Object o : arrInt) {
			ts.add((Integer) o);
		}
		
		System.out.println(ts); //오름차순 정렬
		
		NavigableSet<Integer> tsdescend = ts.descendingSet();
		System.out.println(tsdescend);//내림차순 정렬

		
		///////////////////////////////////////////////////////
		System.out.println("--------------------------");
		HashMap<String, snack> map = new HashMap<>();
		//key : 과자명, 값 : snack 객체
		
		map.put("오예스" , new snack("초코맛",1500));
		map.put("새우깡" , new snack("매새",1500));
		map.put("빼빼로" , new snack("초코맛",1000));
		map.put("마이쭈" , new snack("포도맛",500));
		
		System.out.println(map);
		map.put("빼빼로" , new snack("아몬드",1000)); //키값은 중복x
		System.out.println(map);
		
		///////////////////////////////////////////////////////
		System.out.println("--------------------------");
		TreeMap<String, Integer> treemap = new TreeMap<>();
		treemap.put("apple",60);
		treemap.put("baby",3);
		treemap.put("desk",100);
		treemap.put("cat",22);
		treemap.put("ever",11);
		treemap.put("flower",78);
		treemap.put("goal",52);
		
		NavigableSet<String> ns = (NavigableSet<String>) treemap.subMap("c", "g");
		System.out.println(ns);
		
		TreeMap<Integer , String> tmap = new TreeMap<>();
		tmap.put(100, "김삿갓");
		tmap.put(80, "이삿갓");
		tmap.put(90, "박삿갓");
		tmap.put(87, "최삿갓");
		tmap.put(99, "양삿갓");
		tmap.put(77, "황삿갓");
		
		Entry<Integer , String> entry = tmap.firstEntry(); //Entry만 붙이면됨
		System.out.println("가장 낮은 점수 : " + entry);
		System.out.println("가장 높은 점수 : " + tmap.lastEntry());
		
		//key만 얻어 올 때: entry.getKey();
		// 값만 얻어 올 땨 : entry.getValue();
		
	}

}

class snack {
	private String flavor;
	private int calory;
	public snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "snack [flavor=" + flavor + ", calory=" + calory + "]\n";
	}
	
	
}





