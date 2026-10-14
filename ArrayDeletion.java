package practice;

public class ArrayDeletion {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
        int[] arr1 = new int[arr.length - 1];
//        for (int i = 1; i < arr.length; i++) {
//            arr1[i - 1] = arr[i];
//        }
		
		int idel=2;
		for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != idel) {
                arr1[j++] = arr[i];
            }
        }
		
        
        for (int num : arr1) {
            System.out.print(num + " ");
        }


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
