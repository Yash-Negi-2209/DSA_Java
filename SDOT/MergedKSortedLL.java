import java.util.*;
public class MergedKSortedLL {
  
  	static class ListNode {
    	int val;
    	ListNode next;

    	ListNode(int val) {
        	this.val = val;
        	this.next = null;
    	}
	}

    public static ListNode mergeSortedLists(List<ListNode> lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the heads of all lists to the min heap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy head to simplify the code
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Keep merging until the min heap is empty
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;

            // Move to the next node in the list
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }
        return dummy.next;
    }
    

    @SuppressWarnings("resource")
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      List<ListNode> lists = new ArrayList<>();

      // Build linked lists from input
      for (int i = 0; i < n; i++) {
          ListNode dummy = new ListNode(-1);
          ListNode current = dummy;
          int num;
          while ((num = sc.nextInt()) != -1) {
              current.next = new ListNode(num);
              current = current.next;
          }
          lists.add(dummy.next);
      }

      // Merge sorted linked lists
      ListNode mergedList = mergeSortedLists(lists);

      // Print the merged list
      while (mergedList != null) {
          System.out.print(mergedList.val + " ");
          mergedList = mergedList.next;
       }
	}
}
