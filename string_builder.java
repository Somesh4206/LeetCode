package practice;
import java.util.*;
public class string_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder h = new StringBuilder();
		StringBuilder r = new StringBuilder();
		for(int i=0;i<=s.length();i++) {
			char ch =s.charAt(i);
			if(ch=='-') {
				h.append(ch);
			}else {
				r.append(ch);
			}
		}
		System.out.print(h.toString()+r.toString());

	}

}
