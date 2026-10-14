package practice;
import java.util.*;

public class StringReverse {
	public static String reverse(String s) {
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Reversed : "+reverse(s));

	}

}
