package practice;
import java.util.*;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Celsius : ");
		float n=x.nextFloat();
		float f=(n*9/5)+32;
		System.out.println("Fahrenheit : "+f);
	}

}
