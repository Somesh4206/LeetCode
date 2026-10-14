package practice;
import java.util.Scanner;

public class OddEvenPattern {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int odd=1;
		int even=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2 != 0) {
					System.out.print(odd+" ");
					odd +=2;
				}
				else {
					System.out.print(even+" ");
					even += 2;
				}
			}
			System.out.println();
		}
	}
}
