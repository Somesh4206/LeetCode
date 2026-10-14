package practice;

public class LinearSearch {
	
	public static int linear(int arr[],int targ) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == targ) {
				return i;
			}
		}return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int targ=5;
		System.out.println("index : "+linear(arr,targ));
	}

}
