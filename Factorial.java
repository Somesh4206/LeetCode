package practice;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		long fact=1;
		if(n<0) {
			System.out.println("Factorial is not for -ve num");
		}
		else {
			for(int i=1;i<=n;i++) {
				fact*=i;
			}
			System.out.println("Factorial : "+fact);			
		}
	}

}
	