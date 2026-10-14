package practice;

public class subArray {

	public static void main(String[] args) {
		int arr[]= {1,4,20,3,10,5};
		int targ=5;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum==targ) {
					System.out.println("Index from "+i+" to "+j);
					return;
				}
			}
		}System.out.println("Index not found");
	}
}