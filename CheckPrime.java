package practice;
import java.util.*;
public class CheckPrime {
	
	public static boolean checkPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)	return false;
		}return true;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
//		int n=7;
//		boolean b=checkPrime(n);
//		System.out.println(b);
		System.out.println("Prime Numbers upto "+n+" :");
		for(int i=2;i<=n;i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
}