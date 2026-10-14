package practice;
import java.util.*;
public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long salary=sc.nextLong();
		int experience=sc.nextInt();
		
		
		if(experience>=10) {
			long bonus=salary/10;
			System.out.println(salary+bonus);
			
		}
		else if(experience>=5 && experience<=9)
		{
			double bonus=salary*0.08;
			System.out.println(salary+bonus);
		}
		else
		{
			double bonus=salary*0.05;
			System.out.println(salary+bonus);
		}
	}
}
