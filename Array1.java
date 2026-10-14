package practice;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");

		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
	}

}