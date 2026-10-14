package practice;

import java.util.Scanner;

public class StringPassword {
//	public static void main(String[] args) {
//		String str1="UserPassword";
//		if(str1.length()>=8)	System.out.println("Strong Password");
//		else System.out.println("Weak Password");
//	}
	public static boolean checkPassword(String pass) {
        if (pass == null || pass.length() < 8) {
        		System.out.println("Enter valid Password");
            return false;
        }
        boolean Upper = false;
        boolean Lower = false;
        boolean Digit = false;
        boolean Special = false;

        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) Upper = true;
            else if (Character.isLowerCase(ch)) Lower = true;
            else if (Character.isDigit(ch)) Digit = true;
            //else if ("@#$%!^&*()-_+=<>?/ ".indexOf(ch) != -1) Special = true;
            else 	Special=true;
        }

        return Upper && Lower && Digit && Special;
    }
    public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
        String pass = sc.nextLine();
        if (checkPassword(pass)) {
            System.out.println("Strong password");
        } else {
        		System.out.println("Weak Password");
        }
    }
}
