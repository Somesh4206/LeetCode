package LeetCode;

public class StrintToInteger {
	public static int myAtoi(String str) {
		int n=str.length();
		str.trim();
		if(str.isEmpty())	return 0;
		int sign=1,i=0;
		if(str.charAt(0)=='-') {
			sign=-1;
			i++;
		}
		int result=0;
		while(i<n && Character.isDigit(str.charAt(i))) {
			int digit=str.charAt(i)-'0';
			if(result>(Integer.MAX_VALUE - digit)/10) {
				return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			result=result*10+digit;
			i++;
		}
		return result*sign;
	}
	public static void main(String[] args) {
		String str="541sd";
		int obj=myAtoi(str);
		System.out.println(obj);
		
	}

}
