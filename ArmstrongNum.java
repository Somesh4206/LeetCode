package practice;
import java.util.*;
public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum+=(r*r*r);
			n/=10;
		}
		if(n==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
