
import java.util.*;
public class Subset {

    public static void printsubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
        return;
    }


    public static void Sub(int num, ArrayList<Integer> subset){
        // Base case
        if (num==0){
            printsubset(subset);
            return;
        }
        // element ki choice hai:
        // Agar add hoga:
        subset.add(num);
        Sub(num-1, subset);

        // Agar add nahi hoga:
        subset.remove(subset.size()-1);
        Sub(num-1, subset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        Sub(num, subset);
        sc.close();
    }
}
