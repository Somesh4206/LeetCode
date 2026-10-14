package practice;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n=Sc.nextInt();
		while(n>9) {
			int sum=0;
			while(n!=0) {
				int digit = n%10;
				sum+=digit;
				n/=10;
			}
			n=sum;
		}
		if(n==1) {
			System.out.println("Magic Number");
		}
		else {
			System.out.println("Not Magic Number");
		}
	}

}
