import java.util.*;
public class Basics{
    public static void main(String[] args) {

        // Declare a hashset
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // Size
        // Remember it does not contain duplicate values
        System.out.println(set.size());

        // To print all elements
        System.out.println(set);

        // To iterate
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Delete
        set.remove(1);
        System.out.println("After deletion : "+set);
    }
} 