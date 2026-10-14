package practice;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int sum=0;
		int temp = n;
		while(temp!=0) {
            int digit = temp % 10;
            long fact=1;
            for(int i=1;i<=digit;i++) {
    			fact*=i;
            }
            sum+=fact;
            temp /= 10;  
            
        }
		if(n==sum) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Weak Number");
		}
		
	}
}
