package practice;
import java.util.*;
public class Map_ {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");
//        System.out.println(map1);
//        System.out.println(map1.remove(1));
//        System.out.println(map1.containsKey(2));
//        System.out.println(map1.containsValue("Cherry"));
//        System.out.println(map1.size());
//        System.out.println(map1);
//        map1.clear();
//        System.out.println(map1.isEmpty());
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        Map<Character,Integer>m=new LinkedHashMap<>();
//        for(char ch:str.toCharArray()) {
//        	m.put(ch, m.getOrDefault(ch,0)+1);
//     
//        	
//        }
//        System.out.println(m);
        for (Integer k : map1.keySet()) {
            System.out.println(k + " -> " + map1.get(k));
        }
       for (Map.Entry<Integer, String> entry : map1.entrySet()) {
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
        
    }
        

	}

}
