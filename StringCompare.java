package practice;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="abd";
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		System.out.println(str2.compareTo(str2));
		System.out.println(str1.equals(str2));//Avoid using == to check string
		System.out.println(str1 == str2);//it checks the address
	}

}
