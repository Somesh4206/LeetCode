package practice;

import java.util.*;

public class StrRev2pointer {
	public static String reverse(String s) {
		char c[]=s.toCharArray();
		int st=0;
		int end=s.length()-1;
		while(st<end) {
			char temp=c[st];
			c[st]=c[end];
			c[end]=temp;
			st++;
			end--;
		}return new String(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(reverse(s));
	}
}
