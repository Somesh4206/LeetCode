package practice;
import java.util.*;

public class MAP {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 3, 3};
		Map<Integer,Integer> m1=new HashMap<>();
		for(int x:arr) {
			m1.put(x, m1.getOrDefault(x,0)+1);
		}
		Set<Integer> s1=new HashSet<>(m1.values());
		boolean res=s1.size()==m1.size();
		System.out.println(res);
	}

}
