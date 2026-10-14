package practice;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,2,2};
		int n=arr.length;
		int count=0;
		int majority=-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j])	count++;
				if(count>n/2) {	
					majority=arr[i];
					break;
				}
			}
		}
		System.out.println(majority);
	}
}