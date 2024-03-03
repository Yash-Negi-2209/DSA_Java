import java.util.*;
class ReverseKthNode{

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public static void reverse(Node head){
        Node prev = head;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }


    public static Node findKthNode(Node temp, int k){
        k = k-1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }


    public static Node reverseKgroup(Node head, int k){
        Node temp = head;
        Node prevLast = null;

        while (temp != null){
            Node kthnode = findKthNode(temp, k);

            if (kthnode==null){
                if (prevLast != null){
                    prevLast.next = temp;
                }
                break;
            }

            Node nextNode = kthnode.next;
            kthnode.next = null;
            reverse(temp);
            if (temp==head){
                head = kthnode;
            }
            else {
                prevLast.next = kthnode;
            }
            prevLast = temp;
            temp = nextNode;
            }
            return head;
    }


    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ReverseKthNode main = new ReverseKthNode();

        Node head = null;
        Node prev = null;
        int size = sc.nextInt();
        for (int i=0; i<size; i++){
            int val = sc.nextInt();
            Node newnode = main.new Node(val);     //important 

            if (head==null){
                head = newnode;
            }
            else {
                prev.next = newnode;
            }
            prev = newnode;
        }

        int k = sc.nextInt();
        Node result = reverseKgroup(head, k);
        
        while (result != null) {
            System.out.print(result.val+"->");
            result = result.next;
        }
        System.out.print("NULL");
    }
}