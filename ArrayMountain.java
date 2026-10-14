package practice;

public class ArrayMountain {
	public static boolean CheckMountain(int arr[]) {
		
		int max=Integer.MIN_VALUE;
		int ind=-1;
		int n=arr.length;
		if(n<=2)	return false;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ind=i;
			}
		}
		if(ind==0||ind==n-1)	return false;
		for(int i=0;i<ind;i++) {
			if(arr[i]>=arr[i+1])	return false;
		}
		for(int i=ind;i<n-1;i++) {
			if(arr[i]<=arr[i+1])	return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,3,1};
		boolean ans=CheckMountain(arr);
		System.out.println(ans);
	}
}