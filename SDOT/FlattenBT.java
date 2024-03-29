import java.util.*;

class FlattenBT {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static Node buildtree(String arr[]) {
        if (arr == null || arr[0].equals("N") || arr.length == 0) {
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

    public static void flatten(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        if (root.left != null) {
            flatten(root.left);
            Node temp = root.right;
            root.right = root.left;
            root.left = null;

            Node temp2 = root.right;
            while (temp2.right != null) {
                temp2 = temp2.right;
            }
            temp2.right = temp;
        }
        flatten(root.right);
    }

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("\\s+");
        Node root = buildtree(arr);
        flatten(root);

        Node temp = root;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.right;
        }
    }
}