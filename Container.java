package practice;

class Container {
	public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxarea=0;
        while(start<end){
            int minH=Math.min(height[start],height[end]);
            int wid=end-start;
            int area= minH * wid;
            maxarea=Math.max(maxarea,area);
            if(height[start]<height[end])   start++;
            else    end--;

        }return maxarea;
    }            
	public static void main(String[] args) {
		int height[]= {1,2,3,4,5,6};
		Container c=new Container();
		int obj=c.maxArea(height);
		System.out.println(obj);
	}
}
