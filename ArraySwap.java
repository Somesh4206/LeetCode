package practice;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int temp=arr[0];
		arr[0]=arr[n-1];
		arr[n-1]=temp;
		System.out.println(Arrays.toString(arr));

	}

}
