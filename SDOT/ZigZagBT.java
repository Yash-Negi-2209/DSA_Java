import java.util.*;

class ZigZagBT {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }



    public static Node buildTree(String arr[]) {
        if (arr.length == 0 || arr[0].equals("N") || arr == null) {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(Integer.parseInt(arr[0]));
        q.offer(root);

        int index = 1;
        while (!q.isEmpty() && index < arr.length) {
            Node curr = q.poll();
            String leftval = arr[index];
            index++;
            if (!leftval.equals("N")) {
                curr.left = new Node(Integer.parseInt(leftval));
                q.offer(curr.left);
            }
            if (index < arr.length) {
                String rightval = arr[index];
                index++;
                if (!rightval.equals("N")) {
                    curr.right = new Node(Integer.parseInt(rightval));
                    q.offer(curr.right);
                }
            }
        }
        return root;
    }



    public static void zigzag(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> currlevel = new Stack<>();
        Stack<Node> nextlevel = new Stack<>();

        boolean lefttoright = true;

        currlevel.push(root);

        while (!currlevel.isEmpty()) {
            Node temp = currlevel.pop();
            if (temp != null) {
                System.out.print(temp.val + " ");
                if (lefttoright == true) {
                    if (temp.left != null) {
                        nextlevel.push(temp.left);
                    }
                    if (temp.right != null) {
                        nextlevel.push(temp.right);
                    }
                } else {
                    if (temp.right != null) {
                        nextlevel.push(temp.right);
                    }
                    if (temp.left != null) {
                        nextlevel.push(temp.left);
                    }
                }
            }
            if (currlevel.isEmpty()) {
                lefttoright = !lefttoright;
                Stack<Node> tempStack = currlevel;
                currlevel = nextlevel;
                nextlevel = tempStack;
            }
        }
    }


    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("\\s+");

        Node root = buildTree(arr);
        zigzag(root);
    }
}
