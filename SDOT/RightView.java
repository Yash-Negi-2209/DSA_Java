import java.util.*;

class RightView {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    static class TreeBuilder {
        public Node buildTreeInLevelOrder(String[] arr) {
            if (arr == null || arr.length == 0 || arr[0].equals("N")) {
                return null;
            }

            Queue<Node> queue = new LinkedList<>();
            Node root = new Node(Integer.parseInt(arr[0]));
            queue.offer(root);

            int index = 1;
            while (!queue.isEmpty() && index < arr.length) {
                Node curr = queue.poll();

                String leftVal = arr[index++];
                if (!leftVal.equals("N")) {
                    curr.left = new Node(Integer.parseInt(leftVal));
                    queue.offer(curr.left);
                }

                if (index < arr.length) {
                    String rightVal = arr[index++];
                    if (!rightVal.equals("N")) {
                        curr.right = new Node(Integer.parseInt(rightVal));
                        queue.offer(curr.right);
                    }
                }
            }

            return root;
        }
    }


    public static void rightView(Node root, ArrayList<Integer> list, int curr_level){
        if (root == null){
            return;
        }

        if (curr_level == list.size()){
            list.add(root.val);
        }

        rightView(root.right, list, curr_level + 1); 
        rightView(root.left, list, curr_level + 1);
    }


    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");

        TreeBuilder treeBuilder = new TreeBuilder();
        Node root = treeBuilder.buildTreeInLevelOrder(arr);

        ArrayList<Integer> list = new ArrayList<>();
        rightView(root, list, 0); 

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
