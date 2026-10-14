package practice;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int n = 152;
		int sum = 0;
		for(int i = 1;i<n;i++) {
			if( n%i==0) sum+= i;
			if(sum == n) {
				System.out.println(n + ":perfect Number");
				break;
			}
			
		}
		if(sum!=n) {
			System.out.println("not perfect number");
		}
	}
}
