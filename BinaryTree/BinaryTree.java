public class BinaryTree{

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

    static class BinaryT{

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

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryT tree = new BinaryT();
        node root = tree.buildtree(arr);
        System.out.println(root.data);
    }
}