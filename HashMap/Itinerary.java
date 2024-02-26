import java.util.*;

public class Itinerary {

    public static String getstart(HashMap<String, String> map){

        // Reverse the hashmap 
        HashMap<String, String> revmap = new HashMap<>();
        
        for (String key: map.keySet()){
            revmap.put(map.get(key), key);
        }

        for (String key: map.keySet()){
            if (!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getstart(map);

        while (map.containsKey(start)){
            System.out.print(start+" --> ");
            start = map.get(start);
        }
        System.out.print(start+".");
    }
}
