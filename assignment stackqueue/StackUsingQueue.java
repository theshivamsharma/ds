import java.util.*; 
  
class Stack  
{  
     Queue<Integer> q1 = new LinkedList<Integer>();
     Queue<Integer> q2 = new LinkedList<Integer>();   
  
    void push(int x)  
    {  
        q2.add(x);  
  
        while (!q1.isEmpty())  
        {  
            q2.add(q1.peek());  
            q1.remove();  
        }  

        Queue<Integer> tempq = q1;  
        q1 = q2;  
        q2 = tempq;  
    }  
  
    void pop(){  

        if (q1.isEmpty())  
            return ;  
        q1.remove();  
    }  
  
    int top()  
    {  
        if (q1.isEmpty())  
            return -1;  
        return q1.peek();  
    }  
    void traverse(int n){
       while(n > 0){
        int d = top();
        System.out.print(d+" ");
        pop();
        n--;
       }
    }
   
}
public class StackUsingQueue{

    public static void main(String[] args)  
    {  
        System.out.println("Enter the size of stack");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack s = new Stack();  
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            s.push(d);  
        }
        s.traverse(n);
    } 
} 