
import java.util.*;

public class PowerOf2{

    static boolean isPowerOfTwo(int num){
        int count = 0;
        while(num>0){
            if ((num & 1)==1){
                count++;
            }
            num=num>>1;
        }
        if (count==1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check whether it is a power of two or not: ");
        int num=sc.nextInt();

        if (isPowerOfTwo(num)==true){
        System.out.println("Yes");
        }
        else
        System.out.println("No");
        sc.close();
    }
}