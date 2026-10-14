package practice;

import java.util.Arrays;
import java.util.Scanner;

public class StrAnagram {
//	public static boolean Anagram(String s1,String s2) {
//		char c1[]=s1.toCharArray();
//		char c2[]=s2.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		return Arrays.equals(c1,c2);
//	}
	
	public static boolean CheckAnagramFreq(String s1,String s2) {
		if(s1.length() != s2.length())	return false;
		int freq[]=new int[128];
		for(char c:s1.toCharArray()) freq[c]++; 
		for(char c:s2.toCharArray())	freq[c]--;
		for(int i:freq) {
			if(i!=0)		return false;
		}return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		String s1=sc.nextLine();
		System.out.print("Enter String 2 : ");
		String s2=sc.nextLine();
//		System.out.println("Anagram : "+Anagram(s1,s2))
		boolean ans=CheckAnagramFreq(s1,s2);
		System.out.println(ans);

	}

}
