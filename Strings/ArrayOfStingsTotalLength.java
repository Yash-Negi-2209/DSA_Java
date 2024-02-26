
import java.util.*;
public class ArrayOfStingsTotalLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();

        System.out.println("Enter the Strings: ");
        String arr[] = new String[size];
        int len = 0;
        for(int i=0; i<size; i++){
            arr[i]=sc.next();
            len=len+arr[i].length();
        }
        System.out.println("The total length of all the strings combined is: "+len);
        sc.close();
    }
}
