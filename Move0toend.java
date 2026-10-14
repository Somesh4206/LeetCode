package practice;

import java.util.Arrays;

public class Move0toend {
	public static int[] movezero(int arr[]) {
		int ans[] = new int[arr.length];
		int ind=0;
		for(int i:arr) {
			if(i!=0) {
				ans[ind]=i;
				ind++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,0,2,4,0,0,7,9,0};
		int ans[]=movezero(arr);
		System.out.println(Arrays.toString(ans));

	}

}
