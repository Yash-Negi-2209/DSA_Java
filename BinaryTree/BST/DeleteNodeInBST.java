public class DeleteNodeInBST {
    
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
            root.left =  insert(root.left, val);
        }
        else {
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

    public static node delete(node root, int val){
        
        if (root.data > val){
            root.left =  delete(root.left, val);
        }
        else if (root.data < val){
            root.right = delete(root.right, val);
        }
        else {  // root.data == val

            // case 1
            if (root.left==null && root.right==null){
                return null;
            }

            // case 2
            if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }

            // case 3
            node is = inordersuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }


    public static node inordersuccessor(node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    } 


    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        node root = null;
        for (int i=0; i<values.length; i++){
            root = insert(root, values[i]); 
        }
        inorder(root);
        System.out.println();

        delete(root, 6);
        inorder(root);
    }
}
