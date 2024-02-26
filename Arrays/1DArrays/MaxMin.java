
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();

        int numbers[]=new int[size];

        System.out.println("Enter the numbers: ");

        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }

        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The maximum element in the given array is: "+max+" and the minimum element is: "+min);
        sc.close();
    }
}

