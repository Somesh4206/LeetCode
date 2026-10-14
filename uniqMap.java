package practice;
import java.util.*;
public class uniqMap {

	public static int uniq(String s) {
		Map<Character,Integer>m1=new HashMap<>();
		for (char ch: s.toCharArray()) {
			m1.put(ch,m1.getOrDefault(ch,0)+1);
			
		}
		for(int i=0;i<s.length();i++) {
			if(m1.get(s.charAt(i))==1)	return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		String s="Banana";
		int res=uniq(s);
		System.out.println(res);
	}

}
