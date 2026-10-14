package practice;
import java.util.*;
public class SwapNum {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n1=x.nextInt();
		int n2=x.nextInt();
		/*int temp=n1;
		n1=n2;
		n2=temp;
		*/
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
	
		System.out.println("num1 :"+n1);
		System.out.println("num2 :"+n2);
	}

}
