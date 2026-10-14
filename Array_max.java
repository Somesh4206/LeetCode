package practice;
import java.util.*;


public class Array_max {
	
	public static int max(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>max)  max=num;
		}
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr=new int[size];
		
		for (int i=0;i<=size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[i]);
		//int arr[]= {1,5,3,6,8,5,3,9,3,7};
		int result=max(arr);
		System.out.println(result);
	}

}
