import java.util.*;
class EvenOddLL
{
  
  static class Node{
    int val;
    Node next;
    Node(int val){
      this.val = val;
      this.next = null;
    }
  }
  
  public static Node evenodd(Node head){
    if (head==null || head.next==null){
      return head;
    }
    Node odd = head;
    Node even = head.next;
    Node evenhead = head.next;
    while (even!=null && even.next!=null){
      odd.next = odd.next.next;
      even.next = even.next.next;
      
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenhead;
    return head;
  }
  
  @SuppressWarnings({ "resource", "unused" })
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    EvenOddLL main = new EvenOddLL();
    int size = sc.nextInt();
    Node head = null;
    Node prev = null;
    while (size>0){
      size--;
      int val = sc.nextInt();
      Node newnode = new Node(val);
      if (head==null){
        head = newnode;
      }
      else{
        prev.next = newnode;
      }
      prev = newnode;
    }
      
     Node result = evenodd(head);
      
     while (result!=null){
       System.out.print(result.val+" ");
       result = result.next;
     }
  }
}