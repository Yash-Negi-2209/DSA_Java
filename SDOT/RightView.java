import java.util.*;
class RightView
{
  
  static class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
      this.val = val;
      this.right = null;
      this.left = null;
    }
  }
  
  static class TreeBuilder{
    static int index = -1;
    public Node buildtree(String[] arr){
      index++;
      if (index>=arr.length || arr[index].equals("N")){
        return null;
      }
      Node newnode = new Node(Integer.parseInt(arr[index]));
      newnode.left = buildtree(arr);
      newnode.right = buildtree(arr);
      return newnode;
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
    String arr[] = str.split("\\s+");

    TreeBuilder tree = new TreeBuilder();
    Node root = tree.buildtree(arr);

    ArrayList<Integer> list = new ArrayList<>();
    rightView(root, list, 0);

    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
    }
  }
}