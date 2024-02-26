import java.util.*;
public class Union{

    public static void UnionoftwoArrays(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("There are "+set.size()+" elements in the union array.");
    }

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        UnionoftwoArrays(arr1, arr2);
    }
}