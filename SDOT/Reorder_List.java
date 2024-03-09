import java.util.*;
class Reorder_List
{
  
  static class Node{
    int val;
    Node next;
    Node(int val){
      this.val = val;
      this.next = null;
    }
  }
  
  public static Node findmid(Node head){
    if (head==null || head.next==null){
      return head;
    }
    Node slow = head;
    Node fast = head;
    while (fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
  
  public static Node reverse(Node head){
    Node prev = null;
    Node curr = head;
    while (curr!=null){
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
    
  public  static Node reorder(Node head) {
    if (head == null || head.next == null)
        return head;

    Node midpt = findmid(head);
    Node head1 = head;
    Node head2 = midpt.next;
    midpt.next = null;
    Node shantanu = reverse(head2);
    
    Node dummy = new Node(0);
    Node curr = dummy;
    
    while (head1 != null || shantanu != null) {
        if (head1 != null) {
            curr.next = head1;
            curr = curr.next;
            head1 = head1.next;
        }
        
        if (shantanu != null) {
            curr.next = shantanu;
            curr = curr.next;
            shantanu = shantanu.next;
        }
    }
    return dummy.next;
}

    
  
  @SuppressWarnings({ "resource", "unused" })
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Reorder_List main = new Reorder_List();
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
    head = reverse(head);
    Node result = reorder(head);
    
    while (result!=null){
      System.out.print(result.val+" ");
      result = result.next;
    }
  }
}