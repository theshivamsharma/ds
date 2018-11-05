import java.util.Scanner;

class Node{
	int data;
	Node next;
}
class Stack
{
	Node top;
	Stack()
	{
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
		System.out.println();
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

 class MinStack
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int n = sc.nextInt();
		Stack s = new Stack();
		Stack min = new Stack();
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the element to push");
			int d = sc.nextInt();
			 s.push(d);
			 if(min.top == null)
			 {
			 	min.push(d);
			 }
			 else if(min.top != null && d < min.top.data ){
			 	min.push(d);
			 }

		}
		System.out.println("The stack is ");
		s.display();
		int m = min.pop();
		System.out.println("Smallest element is "+m); 
		System.out.println("poping top element\n");
		int poped = s.pop();
		System.out.println("poped element is "+poped+"\n");
		System.out.println("Stack after popping out is \n");
		s.display();
		

	}
}