import java.util.*; 
  
class Queue  
{  
    Stack<Integer> s1 = new Stack<Integer>();  
    Stack<Integer> s2 = new Stack<Integer>();  
  
    void enQueue(int x)  
    {  
        while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
        }   
        s1.push(x);  
        while (!s2.isEmpty())  
        {  
            s1.push(s2.pop());   
        }  
    }  
    int deQueue()  
    {  
        if (s1.isEmpty())  
        {  
            System.out.println("Queue is Empty");    
        }  

        int x = s1.peek();  
        s1.pop();  
        return x;  
    } 
    public void traverse(int n){

        while(n > 0){
            int d = deQueue();
            System.out.print(d+" ");
            n--;
        }
    } 
}
  public class QueueUsingStack{
         
        public static void main(String[] args)  
        {  
            Queue q = new Queue();  
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of queue");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int d = sc.nextInt();
                q.enQueue(d);
            }  
            q.traverse(n);
        }  
}  