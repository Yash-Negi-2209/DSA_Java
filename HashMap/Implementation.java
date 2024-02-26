
import java.util.*;
public class Implementation {
    
    static class HashMap<K,V>{   //generics: meaning "general datatype" of this class.
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;  //total no of nodes
        private int N;  //total no of buckets
        private LinkedList<Node> buckets[]; //yaha pe "LinkedList<Node>" datatype hai.  N = buckets.length

        @SuppressWarnings("unchecked")

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];    //yaha pe har bucket pe ek linked list declare kari.
            for (int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();    //yaha pe null linkedList connect kari.
            }
        }

        private int hashfunc(K key){
            int bucketIndex = key.hashCode();   //ye koi bhi ek random no deta hai +ve or -ve.(islie agle line me math.abs lagaaya 
                                                //kyuki humko bas +ve value chahiye)
            return Math.abs(bucketIndex) % N;   // kyuki humko 0 se N-1 ke beech me hi rkhna hai bucketindex ko islie "% N" kiya.
        }  

        private int searchInLL(K key, int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];     //It means ki buckets ke iss bucketindex pe ll naam ki linkedlist stored h.
            for (int i=0; i<ll.size(); i++){
                if (ll.get(i).key==key){
                    return i;   // i.e, data index
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbucket[] = buckets;   //puraane data ko oldbucket me store krwa diya
            buckets = new LinkedList[N*2];          //buckets ka size increase krdiya N*2

            for (int j=0; j<buckets.length; j++){
                buckets[j] = new LinkedList<>();    //saare positions pe null ll attach krdi.
            }

            for (int i=0; i<oldbucket.length; i++){
                LinkedList<Node> ll =oldbucket[i];
                for (int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }



        public void put(K key, V value){
            int bucketIndex = hashfunc(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex==-1){     //key does not exist, so just simply add the node to linkedList
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }
            else {        //It means key already exists, so update the value of that particular node.
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }

            double lambda = (double)n/N;

            if (lambda>2.0){    // K=2.0
                // Rehashing
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bucketIndex = hashfunc(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex==-1){     //key does not exist
                return false;
            }
            else {        //It means key already exists
                return true;
            }
        }

        public V get(K key){
            int bucketIndex = hashfunc(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex==-1){     //key does not exist
                return null;
            }
            else {        //It means key already exists
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
        }

        public V remove(K key){
            int bucketIndex = hashfunc(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex==-1){     //key does not exist
               return null;
            }
            else {        //It means key already exists
                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int bi=0; bi<buckets.length; bi++){
                LinkedList<Node> ll = buckets[bi];
                for( int di=0; di<ll.size(); di++){
                    Node node = ll.get(di);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }


    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("US", 100);
        map.put("China", 200);
        
        ArrayList<String> keys = map.keySet();
        for (int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));  //Remve check krne ke lie
    }
}
