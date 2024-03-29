
import java.util.*;
public class InsertionSort {
    
    static void printArray(int arr[]){
        System.out.println("The sorted array is: ");
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for( int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for (int i=1; i<arr.length; i++){
            int current = arr[i];
            int j= i-1;
            while (j>=0 &&  current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
        sc.close();
    }
}
