

// Error aa rha haii recursion me


public class Basic {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];   //a-z
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void Insert(String word){
        Node curr = root;
        for (int i=0; i<word.length(); i++){
            int index = word.charAt(i)-'a';

            if (curr.children[index]==null){
                // addd new node
               curr.children[index] = new Node();
            }

            if (i==word.length()-1){
                curr.children[index].eow = true;
            }

            curr = curr.children[index];
        }
    }

    public static boolean Search(String key){
        Node curr = root;
        for (int i=0; i<key.length(); i++){
            int index = key.charAt(i)-'a';
            Node node = curr.children[index]; 

            if (node==null){
                return false;
            }
            if ( i==key.length()-1 && node.eow == false){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    } 


    public static boolean check(String key){

        if (key.length()==0){
            return true;
        }

        for (int i=0; i<key.length(); i++){
            String firstpart = key.substring(0, i);
            String secondpart = key.substring(i);
            if (Search(firstpart) && check(secondpart)){
                return true;
            }
        }
        return false;
    }   



    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};
        String key = "any";

        for (String word : words){
            Insert(word);
        }

        
        System.out.println(check(key));
        
    }
}
