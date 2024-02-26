
// O(n)

import java.util.*;
public class LevelOrder {

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

    public static void bfs_levelorder(node root){

        if (root==null){
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            node currnode = q.remove();

            if (currnode==null){
                System.out.println();

                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }

            else {
                System.out.print(currnode.data+" ");
                if (currnode.left != null){
                    q.add(currnode.left);
                }
                if (currnode.right != null){
                    q.add(currnode.right);           
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        node root = tree.buildtree(arr);
        bfs_levelorder(root);
    }
}
