package practice;



public class singlylist {
	static class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
    Node head;

    	void printlist() {
    		Node temp=head;
    		while(temp!=null) {
    			System.out.print(temp.data+"->");
    			temp=temp.next;
    		}
    		System.out.println( "Null"+" ");
    	}
    	public void insertAtBeginning(int data) {
    		Node newNode=new Node(data);
    		newNode.next=head;
    		head=newNode;
    		
    	}
    	public void insertAtEnd(int data) {
    		Node newNode=new Node(data);
    		Node temp=head;
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
    		temp.next=newNode;
    	}
    	public void insertAtPosition(int data,int position) {
    		if(position==1) {
    			insertAtBeginning(data);
    			return;
    				
    		}
    		Node newNode=new Node(data);
    		Node temp=head;
    		for(int i=1;i<position-1 && temp!=null;i++) {
    			temp=temp.next;
    			
    		}
    		if(temp==null) {
    			System.out.println("invalid Position");
    			return;
    		}
    		newNode.next=temp.next;
    		temp.next=newNode;
//    		Node temp1=head;
//    		while(temp1!=null) {
//    			System.out.print(temp1.data+"->");
//    			temp1=temp1.next;
//    		}
//    		System.out.println( "Null"+" ");
    		
    	}
    	public void reverse() {
    		Node prev=null;
    		Node curr=head;
    		while(curr!=null) {
    			Node next=curr.next;
    			curr.next=prev;
    			prev=curr;
    			curr=next;
    		}
    		head=prev;
    	}
    	public void deleteByValue(int key) {
    		if(head==null)	return;
    		if(head.data==key) {
    			head=head.next;
    			return;
    		}
    		Node temp=head;
    		while(temp.next!=null && temp.next.data != key) {
    			temp=temp.next;
    		}
    		if(temp.next != null)
    			temp.next=temp.next.next;
    	}
    // ✅ main method
    public static void main(String[] args) {
        singlylist l = new singlylist();
        
        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        
        l.printlist();
        l.insertAtBeginning(5);
        
        l.printlist();
        l.insertAtEnd(15);
        l.printlist();
        l.insertAtPosition(45,6);
        l.printlist();
        l.reverse();
        l.printlist();
        l.deleteByValue(20);
        l.printlist();
    }
}