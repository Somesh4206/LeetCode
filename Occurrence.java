package practice;

public class Occurrence {

	public static void main(String[] args) {
		  int arr[]= {2000,500,1000,500,3000,500};
		  int targ = 500;
		  int ind = -1;
//		  for (int i =arr.length - 1; i >= 0; i--) {
		  for(int i=0;i<arr.length;i++) {
			  if (arr[i] == targ) {
		          ind = i;
//		          break;
		      }
	      }
	      System.out.println("Index : "+ind);
	}
}