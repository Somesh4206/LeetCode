package practice;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int temp=n2;
		int pow=1;
		while(temp>0) {
			pow*=n1;
			temp--;
		}
		System.out.println(n1+"^"+n2+" : "+pow);
	}

}
