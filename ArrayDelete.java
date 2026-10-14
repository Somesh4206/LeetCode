package practice;
import java.util.Arrays;

public class ArrayDelete {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int n=arr.length;
		//n--;
		
		int pos=3;
		for(int i=pos;i<n-1;i++) {
			arr[i]=arr[i+1];
		}n--;
		
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
