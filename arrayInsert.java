import java.util.Arrays;
import java.util.Scanner;

public class arrayInsert {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Enter the no of elements to add");
		int toadd=sc.nextInt();
		
		System.out.println("Enter values");
		for(int i=0;i<toadd;i++) {
			arr[n+i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
