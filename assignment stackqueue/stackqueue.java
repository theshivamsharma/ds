import java.util.Scanner;

class Node{
	int data;
	Node next;
} 
class Queue{

	Node front,rear;
	public Node enqueElement(Node head){
		Node tmp = head;
		Node newnode = new Node();
		Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		System.out.println("Enter the element to insert");
		int d  = sc.nextInt();
		newnode.data = d;
		if(head == null){
			front = newnode;
			rear = newnode;
			tmp = newnode;
		}
		else{
			
			while(tmp.next != null)
			{
				tmp =tmp.next;
			} 
			tmp.next = newnode;
			rear = rear.next;
		}
		return front; 
	}
	public void display(Node head){
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
class Stack{
	Node top;
	Stack(){
		top = null;
	}
	public void push(int data){
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = null;
		if(top == null){
			top = newnode;
		}
		else{
			newnode.next = top;
			top = newnode;
		}	

	}
	public void display(){
		Node tmp = top;
		while(tmp != null){
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	public int pop(){
		if(top == null){
			System.out.println("Underflow");
			return -1;
		}
			int d = top.data;
			top = top.next;
			return d;
	}
	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		else{
			return false;
		}
	}
}

class StackAndQueue
{
	
	public static void main(String[] args) 
	{
		Node head = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Stack Implementation\n");
		Stack top = new Stack();
		System.out.println("Enter the size of Stack");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			top.push(sc.nextInt());
		} 	
		System.out.println("original stack");
		top.display();
		System.out.println();
		top.pop();
		System.out.println("After poping");
		top.display();
		System.out.println();
		if(top.isEmpty()) System.out.println("Empty");
		else System.out.println("Not Empty");

		System.out.println("\n");
		System.out.println("Queue Implementation");
		Queue obj = new Queue();
		for(int i = 0; i < n; i++){
			head = obj.enqueElement(head);
		}
		obj.display(head);
	}
}