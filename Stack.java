package practice;

public class Stack {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;	
		}
	}
	public Node top;
	
	public void push(int x) {
		Node newNode=new Node(x);
		newNode.next=top;
		top=newNode;
		System.out.println(x+" Pushed");
	}
	public int pop() {
		if(top==null) {
			System.out.println("Stack underflow");
			return -1;
			
		}
		int popped =top.data;
		top=top.next;
		return popped;
		
		
	}
	//display
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	 public static void main(String[] args) {
	        Stack stack = new Stack(); // create object

	        stack.push(25);
	        stack.push(20);
	        stack.push(26);
	        stack.push(55);
	        
	        //System.out.println("top " +stack.peek());
	        System.out.println("pop "+ stack.pop());
	        stack.display();
	}

}
