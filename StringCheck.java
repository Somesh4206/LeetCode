package practice;

import java.util.Arrays;

public class StringCheck {

	public static void main(String[] args) {
		String str1="Hello World";
		String str2="Hello";
		String str="    Hello   ";
		System.out.println(str1.length());
		System.out.println(str1.contains(str2));
		System.out.println(str1.startsWith(str2));
		System.out.println(str1.endsWith("World"));
		System.out.println(str1.indexOf("o"));
		System.out.println(str1.lastIndexOf("l"));
		
		str=str.trim();
		System.out.println(str);
		
		String st="Hello_World!";
		String s[]=st.split("_");
		System.out.println(Arrays.toString(s));
		
		String str3="Hello World 12345678";
		char ch[]=str3.toCharArray();
		System.out.println(Arrays.toString(ch));
	}

}
