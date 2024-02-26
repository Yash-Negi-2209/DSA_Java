
import java.util.*;

public class CountOnes {
    
    static int Count(int num){
        int count=0;
        while(num>0){
            if ((num & 1)==1){
                count = count+1;
            }
            num=num>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to count the No. of ones in binary: ");
        int num = sc.nextInt();

        System.out.println("No. of 1's is: "+Count(num));
        sc.close();
    }
}
