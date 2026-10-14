package practice;

public class ArrayCheckSort {
	public static boolean CheckSort(int arr[]) {
		int n=arr.length;
		boolean asc=true;
		boolean des=true;
		for(int i=0;i<n-1;i++) {
			//if(arr[i]==arr[i+1])	continue;
			if((arr[i]<arr[i+1]))	des=false;
			if((arr[i]>arr[i+1])) 	asc=false;			
		}
		return asc || des;

	}
	public static void main(String[] args) {
		int arr[]= {6,7,8,9,9};
		boolean ans=CheckSort(arr);
		System.out.println(ans);
	}
}
