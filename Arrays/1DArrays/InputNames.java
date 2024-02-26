import java.util.*;

public class InputNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();

        String names[]=new String[size];
        System.out.println("Enter the names: ");
        for(int i=0; i<size; i++){
            names[i]= sc.next(); 

            // Yaha pe ptaani nextLine lene se ek input kam le rha hai.
            // next lene se theek aa rha hai.
            
        }
        System.out.println();
        System.out.println("The names entered by user are: ");
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
}
