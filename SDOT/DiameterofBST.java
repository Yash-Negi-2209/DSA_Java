import java.util.*;

class DiameterofBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static Node buildBST(Node root, int num) {
        if (root == null) {
            root = new Node(num);
            return root;
        }
        if (root.val > num) {
            root.left = buildBST(root.left, num);
        } else {
            root.right = buildBST(root.right, num);
        }
        return root;
    }

    static int findDiam(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ld = findDiam(root.left);
        int rd = findDiam(root.right);
        return Math.max(lh + rh + 1, Math.max(ld, rd));
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num;
        do {
            num = sc.nextInt();
            if (num != -1) {
                list.add(num);
            }
        } while (num != -1);
        Node root = null;
        for (int i = 0; i < list.size(); i++) {
            root = buildBST(root, list.get(i));
        }

        int result = findDiam(root);
        System.out.println("Diameter of the given binary tree is " + result);
    }
}
