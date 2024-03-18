import java.util.*;

class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int num) {
        int size = q.size();
        q.add(num);
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }

    void pop() {
        q.remove();
    }

    int top() {
        if (q.isEmpty()) {
            return -1;
        }
        return q.peek();
    }

    boolean isEmpty() {
        return q.isEmpty();
    }

    void print(){
        System.out.println("YOUR STACK IS: ");
        Queue<Integer> temp = new LinkedList<>(q); 
        while (!temp.isEmpty()){
            System.out.println(temp.remove()); 
        }
    }
    


    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOICES: ");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.println("4. isEmpty");
        System.out.println("5. print stack");
        StackUsingQueue stack = new StackUsingQueue();

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice ==-1){
                System.out.println("THANK YOU");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter the number to be inserted: ");
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.print("The top element is: ");
                    System.out.println(stack.top());
                    break;
                case 4:
                    System.out.println(stack.isEmpty() ? "The stack is empty" : "The stack is not empty");
                    break;
                case 5:
                    stack.print();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
