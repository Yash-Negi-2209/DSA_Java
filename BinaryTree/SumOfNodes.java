
public class SumOfNodes {

    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static node buildtree(int arr[]){
            index++;
            if (arr[index]==-1){
                return null;
            }
            node newnode = new node(arr[index]);
            newnode.left = buildtree(arr);
            newnode.right = buildtree(arr);
            return newnode;
        }
    }

    public static int sum_nodes(node root){
        if (root==null){
            return 0;
        }
        int leftnodes = sum_nodes(root.left);
        int rightnodes = sum_nodes(root.right);
        return leftnodes+rightnodes+root.data;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root = tree.buildtree(arr);
        int result = sum_nodes(root);
        System.out.println("Sum of Nodes is: "+result);
    }
}