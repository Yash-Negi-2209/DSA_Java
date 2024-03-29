import java.util.*;

class RootLeafNumberSum {
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

    public static int RootLeafSum(Node root, int curr) {
        if (root == null) {
            return 0;
        }
        curr = curr * 10 + root.val;
        if (root.left == null && root.right == null) {
            return curr;
        }
        int left = RootLeafSum(root.left, curr);
        int right = RootLeafSum(root.right, curr);

        return left + right;
    }

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("\\s+");

        Node root = buildtree(arr);
        int result = RootLeafSum(root, 0);
        System.out.println(result);
    }
}