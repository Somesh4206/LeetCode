package practice;
import java.util.*;
public class GreatestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int great=0;
		while(n>0) {
			int digit=n%10;
			if(digit>great) {
				great=digit;
			}
			n/=10;
		}
		System.out.println(great);
		
	}

}
