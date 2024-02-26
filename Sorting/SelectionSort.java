
import java.util.*;
public class SelectionSort {

    static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for( int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<arr.length-1; i++){
            int shortest = i;                            //Shortest me index daal rhe hai naa ki element.  
                for (int j=i+1; j<arr.length; j++){      //Time comp yaha bhi O(n^2) hi haii.
                    if (arr[j]<arr[shortest]){
                        shortest = j;
                    }
                }
                int temp = arr[shortest];
                arr[shortest] = arr[i];
                arr[i] = temp;
            }

            System.out.println("The sorted array is: ");
            printArray(arr);
            sc.close();
    }
}

