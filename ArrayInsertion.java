package practice;

public class ArrayInsertion {

	public static void main(String[] args) {
		int[] arr = new int[6];
        int n = 5;
        int[] arr1 = {10, 20, 30, 40, 50};
        
//      for (int i = 0; i<n; i++) {
//      	arr[i] = arr1[i];
//      }
//      arr[n] = 60;
//      n++;
        
//        
//        for(int i=n-1;i>=0;i--)	arr[i+1] = arr1[i];
//        arr[0]=60;
//        n++;
        
        int pos=2;
        int ele=25;
        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = ele; 
      
        for (int i = 0; i < n; i++) { 
        	System.out.print(arr[i]+" ");
        }
	}
}
 