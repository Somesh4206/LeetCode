package practice;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter mark :");
		int a=x.nextInt();
		String grade=(a>=90)?"A":(a>=80)?"B":(a>=70)?"C":(a>=60)?"D":"Fail";
		System.out.print("Grade : "+grade);
	}
}
		