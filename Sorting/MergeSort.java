
import java.util.*;
public class MergeSort {

    public static void Conquer(int arr[], int si, int mid, int ei){
        int index1 = si;
        int index2 = mid+1;
        int x = 0;
        int emptyarr[] = new int[ei-si+1];
        while (index1 <= mid && index2 <= ei){
            if (arr[index1] <= arr[index2]){
                emptyarr[x++] = arr[index1++];
            }
            else{
                emptyarr[x++] = arr[index2++];
            }
        }
        // jo elements bache hai, ye wala unn elements ke lie hai.
        while ( index1 <= mid){
            emptyarr[x++] = arr[index1++];
        }
        // jo elements bache hai, ye bhi unn elements ke lie hai.
        // par in dono me se ek hi true hogaa.
        while ( index2 <= ei){
            emptyarr[x++] = arr[index2++];
        }

        for (int i=0, j=si; i<emptyarr.length; i++,j++){
            arr[j] = emptyarr[i];
        }
    }



    public static void Divide(int arr[], int si, int ei){

         if (si >= ei){
            return;
        }

        int mid = si + (ei-si) / 2;      // si + ei bhi use kar skte hai par usme by chance kabhi ei bohot lamba ho, to space comp
                                           // ka issue aa skta hai. So it is better to use that.
        
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        Conquer(arr, si, mid, ei); 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int n = arr.length;
        System.out.print("Enter the elements: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Divide(arr, 0, n-1);
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
