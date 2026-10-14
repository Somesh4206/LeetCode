package practice;
import java.util.*;

public class StringCompression {
	public static String Compression(String s) {
		int freq[]=new int[26];
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()) {
			freq[c-'a']=freq[c-'a']+1;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i] != 0) {
				char c=(char) (i+'a');
				sb.append(c).append(freq[i]);
			}
		}return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(Compression(s));

	}

}
