package practice;

public class StrCountVowel {
	public static int Count(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		for(char i:ch) {
			//if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')	count++;
			if("aeiouAEIOU".indexOf(i) != -1)	count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String s="aeiou Apple ice";
		int ans=Count(s);
		System.out.println(ans);
	}
}
