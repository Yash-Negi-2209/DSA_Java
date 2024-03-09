import java.util.*;
class Main
{
  
  static class Node{
    int val;
    Node next;
    Node(int val){
      this.val = val;
      this.next = null;
    }
  }
  
  public static Node rotate(Node head, int num){
    Node temp = head;
    int count = 1;
    while(temp.next != null){
        temp = temp.next;
        count++;
    }
    int k = count - num;
    int len_front = count - (k % count);
    temp.next = head; 
    
    temp = head;
    for (int i = 0; i < len_front - 1; i++){
        temp = temp.next;
    }
    Node newHead = temp.next;
    temp.next = null;
    return newHead;
}

  
  
  @SuppressWarnings({ "resource", "unused" })
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Main main = new Main();
    Node head = null;
    Node prev = null;
    while (true){
      int val = sc.nextInt();
      if (val == -1){
        break;
      }
      else{
        Node newnode = new Node(val);
        if (head==null){
          head = newnode;
        }
        else{
          prev.next = newnode;
        }
        prev = newnode;
      }
    }
    
    int num = sc.nextInt();

    System.out.println("Given linked list:");
    Node temp = head;
    while (temp!=null){
      System.out.print(temp.val+" ");
      temp = temp.next;
    }
    
    Node result = rotate(head, num);
    
    System.out.println();
    System.out.println("Rotated Linked list:");
    while (result!=null){
      System.out.print(result.val+" ");
      result = result.next;
    }
  }
}