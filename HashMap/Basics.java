
import java.util.*;

public class Basics {
    public static void main(String[] args) {

        // Syntax
        HashMap<String, Integer> map = new HashMap<>();

        // To insert
        map.put("India", 150);
        map.put("USA", 120);
        map.put("China", 170);
        map.put("Russia", 100);

        System.out.println(map);


// // To search
//         //  1. returns true or false
//         if (map.containsKey("India")){
//             System.out.println("India is present as a key");
//         }
//         else System.out.println("India is not present");

        

//         //  2. returns the value
//         System.out.println(map.get("USA"));
//         System.out.println(map.get("Pakistan"));

        // To iterate
        // 1.
        for (Map.Entry<String, Integer> val : map.entrySet()){
            System.out.println(val.getKey());
            System.out.println(val.getValue());
        }

        System.out.println();

        // 2.
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        System.out.println();
        
        // Ṭo remove
        map.remove("China");
        System.out.println(map);
    }
}
