import java.util.*;
public class QuickSort {

    public static int partition(int arr[], int low, int high){
        int i = low-1;
        int pivot = arr[high];
        for (int j=low; j<high; j++){

            if (arr[j]<pivot){
                i++;
                // swap:
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Pivot ko centre me laane ke lie :
            i++;
            int temp = arr[i];
            arr[i] = pivot;
            arr[high] = temp;
            return i; //pivot index

    }

    public static void quickSort(int arr[], int low, int high){

        if (low < high){
            int pivot_inx = partition(arr, low, high);
            quickSort(arr, low, pivot_inx-1);
            quickSort(arr, pivot_inx+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter the elements: ");
        int arr[]= new int[size];
        int n = arr.length;
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
