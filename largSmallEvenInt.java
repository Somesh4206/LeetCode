package practice;
import java.util.Scanner;

public class largSmallEvenInt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int num:arr) {
			if(num%2==0) {
				if(num>largest) {
					largest=num;
				}
				if(num<smallest) {
					smallest=num;
				}
				
			}
		}System.out.println("Largest : "+largest);
		System.out.println("Smallest : "+smallest);
	}
}
