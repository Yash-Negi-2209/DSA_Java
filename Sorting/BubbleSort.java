
import java.util.*;
public class BubbleSort {

    static void printArray(int arr[]){

        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int bubble[] = new int[size];

        System.out.println("Enter the elements of array: ");
        for (int i=0; i<size; i++){
            bubble[i] = sc.nextInt();
        }

        for( int i=0; i<bubble.length-1; i++){                          // TIME COMP. IS (n^2)
            for ( int j=0; j<bubble.length-i-1; j++){
                if (bubble[j] > bubble[j+1]){
                    int temp = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        printArray(bubble);
        sc.close();
    }
}
