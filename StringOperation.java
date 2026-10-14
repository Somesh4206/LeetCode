package practice;

import java.util.*;

public class StringOperation {
//	public static String SubString(String str) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter start : ");
//		int st=sc.nextInt();
//		System.out.print("Enter End : ");
//		int end=sc.nextInt();
//		return str.substring(st,end);
//	}
	public static void main(String[] args) {
//		Scanner sc1=new Scanner(System.in);
//		System.out.print("Enter String : ");
//		String str=sc1.nextLine();
//		System.out.println(SubString(str));
		String str="Hello";
		//String s="Hello";
		System.out.println(System.identityHashCode(str));
		//System.out.println(System.identityHashCode(s));
		str=str+" World";
		String s=new String("Hello");
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(s));
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		joiner.add("Apple").add("Banana").add("Cherry");
		System.out.println(joiner);
		StringBuilder sb =new StringBuilder(str);
		sb=sb.reverse();
		System.out.println(sb);
	} 
}