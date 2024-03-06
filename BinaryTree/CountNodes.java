
public class CountNodes {

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

    public static int CountOfNodes(node root){
        if (root==null){
            return 0;
        }
        int leftnodes = CountOfNodes(root.left);
        int rightnodes = CountOfNodes(root.right);
        return leftnodes+rightnodes+1;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root = tree.buildtree(arr);
        int result = CountOfNodes(root);
        System.out.println("Count of Nodes is: "+result);
    }
}