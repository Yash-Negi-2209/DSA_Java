import java.util.*;

class Merge2SortedLL {
  
  class Node {
    int val;
    Node next;
    
    Node(int val) {
      this.val = val;
      this.next = null;
    }
  }
  
  public Node merge(Node list1, Node list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    if (list1.val < list2.val) {
      list1.next = merge(list1.next, list2);
      return list1;
    } else {
      list2.next = merge(list1, list2.next);
      return list2;
    }
  }
    
  @SuppressWarnings("resource")
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    Merge2SortedLL main = new Merge2SortedLL(); // Create an instance of Merge2SortedLL class
    
    int size1 = sc.nextInt();
    Node list1 = null;
    Node prev = null;
    for (int i = 0; i < size1; i++) {
      int val = sc.nextInt();
      Node newNode = main.new Node(val); // Create a new Node
      if (list1 == null) {
        list1 = newNode;
      } else {
        prev.next = newNode;
      }
      prev = newNode;
    }
    
    int size2 = sc.nextInt();
    Node list2 = null;
    prev = null;
    for (int i = 0; i < size2; i++) {
      int val = sc.nextInt();
      Node newNode = main.new Node(val); // Create a new Node
      if (list2 == null) {
        list2 = newNode;
      } else {
        prev.next = newNode;
      }
      prev = newNode;
    }
    
    Node result = main.merge(list1, list2); // Call the merge method
    
    // Print the merged list
    while (result != null) {
      System.out.print(result.val + "->");
      result = result.next;
    }
    System.out.print("NULL");
  }
}
