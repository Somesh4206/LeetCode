package practice;
import java.util.*;

public class StringBasics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();//for printing a single word
		System.out.println(str);
		
		String st=sc.nextLine();//for complete string
		String str1="Hello";

		System.out.println(st.equalsIgnoreCase(st));
		System.out.println(st);
		System.out.println(System.identityHashCode(str1));//to show hash reference
		
		
		String s="H e ll  o";
		System.out.println(s.replace(" ",""));
	}
}
