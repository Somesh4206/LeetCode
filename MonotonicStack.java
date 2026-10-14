package practice;
import java.util.Stack;

public class MonotonicStack {

	public static void main(String[] args) {
		int arr[]= {5,3,8,2,7};
		Stack<Integer> stack = new Stack<>();
		for(int num:arr) {
			while(!stack.isEmpty() && stack.peek()>num) {
				stack.pop();
			}
			stack.push(num);
		}
		System.out.println(stack);

	}

}
