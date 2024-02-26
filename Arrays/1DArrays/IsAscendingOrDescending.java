
import java.util.*;
public class IsAscendingOrDescending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();

        int numbers[]=new int[size];
        System.out.println("Enter the elements: ");

        for (int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        boolean IsAscending = true;

        for(int j=0; j<size-1; j++){
            if(numbers[j]>numbers[j+1]){
                IsAscending = false;
            }
        }
        if (IsAscending){
            System.out.println("The array is sorted in ascending order.");
        }
        else System.out.println("The array is not sorted in ascending order.");
        sc.close();
    }
}
