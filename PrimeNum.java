package practice;

public class PrimeNum {

	
	public static void prime(int num) {
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) count++;
			
		}
		if(count==2) System.out.println("Prime");
		else {
			System.out.println("Not Prime");
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int count=0;
		prime(num);

}
}