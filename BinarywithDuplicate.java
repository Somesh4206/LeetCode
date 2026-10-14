package practice;

public class BinarywithDuplicate {

	public static int Binary(int arr[],int targ) {
		int left=0;
		int right=arr.length-1;
		int res=-1;
		while(left<=right) {
			int mid=left+(right - left)/2;
			if(arr[mid]==targ) {
				res=mid;
				left=mid+1;
			}
			else if(arr[mid]<targ)	left=mid+1;
			else		right=mid-1;
		}return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,2,2,3,3,3,3};
		int targ=2;
		System.out.println(Binary(arr,targ));

	}

}
