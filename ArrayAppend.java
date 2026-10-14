package practice;
import java.util.*;

public class ArrayAppend {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		System.out.println("Enter the no of elements to add");
		int toadd=sc.nextInt();
		int arr1[]=new int[arr.length+toadd];
		for(int i=0;i<n;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("Enter values");
		for(int i=0;i<toadd;i++) {
			arr1[n+i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
	}

}
