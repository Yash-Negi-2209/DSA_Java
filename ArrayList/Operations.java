
import java.util.ArrayList;
import java.util.Collections;

public class Operations {
    public static void main(String[] args) {
        // Remember first letter capital.
        ArrayList<Integer> yash1 = new ArrayList<>();
        // ArrayList<String> yash2 = new ArrayList<>();
        // ArrayList<Boolean> yash3 = new ArrayList<>();

        // add elements:
        yash1.add(2);
        yash1.add(5);
        yash1.add(7);
        yash1.add(0);

        System.out.println(yash1);


        // get element:
        int index = yash1.get(0);     //this means 0th index pe jo bhi hai usko get krlo
        System.out.println(index);

        // add element in between
        yash1.add(2, 9);
        System.out.println(yash1);


        // set element:
        yash1.set(2, 1);
        System.out.println(yash1);

        // Delete element:
        yash1.remove(2);
        System.out.println(yash1);

        // Size of arraylist:
        int size = yash1.size();
        System.out.println("Size is: "+size);

        //loops:
        for(int i=0; i<yash1.size(); i++){
            System.out.println(yash1.get(i));
        }

        // sorting:
        Collections.sort(yash1);
        System.out.println("Sorted ArrayList is: "+yash1);
    }
}
