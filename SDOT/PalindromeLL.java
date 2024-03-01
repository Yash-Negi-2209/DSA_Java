import java.util.*;

public class PalindromeLL {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean isPalindrome(Node head) {
        Node slow = head, fast = head, prev = null, temp;

        // Find the midpoint
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;

        // Compare the first and reversed second halves
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        PalindromeLL main = new PalindromeLL();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Node head = null;
        Node prev = null;

        // Read input values and build the linked list
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            Node newNode = main.new Node(val);

            if (head == null) {
                head = newNode;
            } else {
                prev.next = newNode;
            }
            prev = newNode;
        }

        // Check if the linked list is a palindrome
        boolean result = main.isPalindrome(head);
        System.out.println(result?"True":"False");
    }
}
