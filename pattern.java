package practice;
import java.util.*;

public class pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tri1=sc.nextInt();
		int tri2=sc.nextInt();
		int tri3=sc.nextInt();
		if(tri1==tri2 && tri2==tri3 && tri3==tri1)
		{
			System.out.println("3 sides equal");
		}
		else if(tri1==tri2 || tri2==tri3 || tri3==tri1)
		{
			System.out.println("2 sides equal");
		}
		else {
			System.out.println("no sides equal");
		}
		
		
		
	
		}
	}

