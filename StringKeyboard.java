package practice;

import java.util.Arrays;

public class StringKeyboard {
	public static String[] Keyboard(String[] word) {
		String s1="qwertyuiopQWERTYUIOP";
		String s2="asdfghjklASDFGHJKL";
		String s3="zxcvbnmZXCVBNM";
		int ind=0;
		String str[] = new String[word.length];
		for(String wd : word) {
			int f1=0;
			int f2=0;
			int f3=0;
			for(char c:wd.toCharArray()) {
				if(s1.contains(String.valueOf(c)))	f1++;
				else if(s2.contains(String.valueOf(c)))	f2++;
				else if(s3.contains(String.valueOf(c)))	f3++;
			}
		int n=wd.length();
		if(f1==n||f2==n||f3==n) str[ind++]=wd;
		}
		String ans[] = new String[ind];
		ind=0;
		for(String s:str) {
			if(s!=null)	ans[ind++]=s;
		}
		return ans;
	}
	public static void main(String[] args) {
		String word[]= {"Alaska","dad","Hello"};
		System.out.println(Arrays.toString(Keyboard(word)));
	}
}
