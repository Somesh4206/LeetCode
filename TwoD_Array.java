package practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("____________________");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("____________________");
		
		for(int []rows:arr) {
			for(int value:rows) {
				System.out.print(value);
			}
			System.out.println();
		}
		System.out.println("_____________________");
		System.out.println(Arrays.deepToString(arr));
	}
	
}
