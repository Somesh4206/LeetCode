package practice;

public class Pattern_n {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println( );
		}
//		int row=5;
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=row-i;j++) {
//				System.out.print(" ");
//			}
//			int num=1;
//			int col=1;
//			while(col<=i) {
//				System.out.print(num);
//				num++;
//				col++;
//			}
//			System.out.println();
//		}
	}

}
