public class SearchInBST {

    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
        }
    }

    public static node insert(node root, int val){
        if (root==null){
            root = new node(val);
            return root;
        }
        if (root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(node root, int key){
        if (root==null){
            return false;
        }
        if (root.data > key){
            return search(root.left, key);
        }
        else if (root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        node root = null;

        for(int i=0; i< values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        int key = 1;
        boolean result = search(root, key);
        System.out.println();
        System.out.println(result);
    }
}
