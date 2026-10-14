package practice;

public class PatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==(num+1)/2||j==(num+1)/2) {
						System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}

}
