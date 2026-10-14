package LeetCode;

import java.util.Scanner;

public class String_Compression {
	public int strcom(char arr[]) {
		
		int write=0;
		int i=0;
		while(i < arr.length) {
			char curr=arr[i];
			int count=0;
		
			while(i<arr.length && arr[i] ==curr) {
				i++;
				count++;
			}
			arr[write]=curr;
			write++;
			if(count > 1) {
				String cn=String.valueOf(count);
				for(int j=0;j<cn.length();j++) {
					arr[write]=cn.charAt(j);
					write++;
				}
			}
		}return write;
	}
	public static void main(String[] args) {
		char arr[]= {'a','a','b','b','c','c','c'};
		String_Compression SC=new String_Compression();
		int obj=SC.strcom(arr);
		System.out.println(obj);

	}

}
