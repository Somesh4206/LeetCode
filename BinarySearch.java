package practice;

public class BinarySearch {
	
	public static int Binary(int arr[],int targ) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left+(right - left)/2;
			if(arr[mid]==targ)	return mid;
			else if(arr[mid]<targ)	left=mid+1;
			else		right=mid-1;
		}return -1;
	}
	public static void main(String[] args) {
		int arr[]= {-1,-5,0,7,3,22,8};
		int targ=7;
		System.out.println("index : "+Binary(arr,targ));
	}
}
