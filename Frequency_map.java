package practice;
import java.util.*;
public class Frequency_map {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=new HashMap<>();
		for(int num : arr) {
//			if(map.containsKey(num)) {
//				map.put(num, map.get(num)+1);
//			}
//			else {
//				map.put(num, 1);
//			}
			map.put(num, map.getOrDefault(num, 0) + 1);

		}
		System.out.println(map);
	}

}
