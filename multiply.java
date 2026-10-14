package practice;
import java.util.*;
public class multiply {

	public static void main(String[] args) {
		
		Scanner Scanner=new Scanner(System.in);
		int n=Scanner.nextInt();
		int times=Scanner.nextInt();
		int mul=0;
		for(int i=1;i<=times;i++) {
			mul+=n;
		}
		System.out.println(mul);
	}

}
