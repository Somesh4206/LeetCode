package practice;

import java.util.Scanner;

public class StrRevSB {
	public static String reverseSB(String s) {
////		StringBuilder sb=new StringBuilder();
////		sb.append(s);
////		sb.reverse();
////		return sb.toString();
//		StringBuilder sb=new StringBuilder(s);
//		return sb.reverse().toString();
		
		
		String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        return sb.toString().trim();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(reverseSB(s));

	}
}
