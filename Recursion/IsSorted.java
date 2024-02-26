
import java.util.*;
public class IsSorted {

    public static boolean Sorted(int arr[], int index){
        
        if (index==arr.length-1){
            return true;
        }
        
        if (arr[index]>=arr[index+1]){
            return false;
        }

        return Sorted(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements: ");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Sorted(arr, 0));
        sc.close();
    }
}
