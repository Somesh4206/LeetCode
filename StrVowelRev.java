package practice;
import java.util.*;

public class StrVowelRev {
	public static String Vowels(String str) {
		char ch[] =str.toCharArray();
		int st=0;
		int end=ch.length-1;
		while(st<end) {
//			while(st<end && !(ch[st]=='a'||ch[st]=='e'||ch[st]=='i'||ch[st]=='o'||ch[st]=='u'))	st++;
			while(st<end && !("aeiouAEIOU".indexOf(st)!=-1))	st++;
//			while(st<end && !(ch[end]=='a'||ch[end]=='e'||ch[end]=='i'||ch[end]=='o'||ch[end]=='u'))	end--;
			while(st<end && !("aeiouAEIOU".indexOf(end)!=-1))	end--;
			
			char temp=ch[st];
			ch[st]=ch[end];
			ch[end]=temp;
			st++;
			end--;
		}return new String(ch);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		String str=sc.nextLine();
		System.out.println(Vowels(str));
	}
}
