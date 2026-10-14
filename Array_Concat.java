package practice;

public class Array_Concat {
	public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]=nums[i];
        }
        return ans;
    }
	public static void main(String[] args) {
		int nums[]= {1,2,1};
	}
}
