package practice;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int sq=n*n;
		int sum=0;
		while(sq!=0) {
			int digit = sq % 10;  
            sum += digit;   
            sq /= 10;            
        }
		if(n==sum) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not Neon Number");
		}
	}

}
