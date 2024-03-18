import java.util.*;
class QueueUsingStacks
{
  
  static Stack<Integer> stack1 = new Stack<>();
  static Stack<Integer> stack2 = new Stack<>();
  
  public static void enqueue(int num){
    while(!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }
    stack1.push(num);
    while(!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
  }
  
  public static int dequeue(){
    if (stack1.isEmpty()){
      return -1;
    }
    int top = stack1.pop();
    return top;
  }
    
  @SuppressWarnings({ "unused", "resource" })
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    while (size>0){
      size--;
      int num = sc.nextInt();
      enqueue(num);
    }
    
    int deq = sc.nextInt();
    while (deq>0){
      deq--;
      int x = dequeue();
    }
    
    System.out.println("Queue elements are:");
    while (!stack1.isEmpty()){
    	System.out.print(dequeue()+" ");
    }
  }
}