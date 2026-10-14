package practice;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
	        
	    int org = n;
	    int rev = 0;
	        
	    while (n != 0) {
	    	int digit = n % 10;
	        rev = rev * 10 + digit;
	        n /= 10;
	    }
	        
	    if(org==rev) {
	    	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not a Palindrome");
	    }
		
	}
}
  