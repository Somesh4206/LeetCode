package practice;

public class ArrayZigZag {
	public static boolean isZigZag(int arr[]) {
		int n=arr.length;
		if(n<3)	return false;
		for(int i=1;i<n-1;i++) {
			if(!(arr[i-1]<arr[i] && arr[i]>arr[i+1] || arr[i-1]>arr[i] && arr[i]<arr[i+1])) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,2,7,1,5,2,6};
		boolean ans=isZigZag(arr);
		System.out.println(ans);

	}

}
