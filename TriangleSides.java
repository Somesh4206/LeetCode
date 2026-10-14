package practice;

import java.util.Scanner;

public class TriangleSides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		int c=x.nextInt();
		if(a==b && a==c) {
			System.out.println("Equivalent");
		}
		else if(a==b||b==c||a==c) {
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scalene");
		}
	}

}
