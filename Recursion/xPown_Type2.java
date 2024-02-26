
import java.util.*;
public class xPown_Type2 {

    public static int Calculate(int x, int n){

        if ( x==0){
            return 0;
        }
        else if (n==0){
            return 1;
        }
        if (n%2==0){
            return Calculate(x, n/2) * Calculate(x, n/2);
        }
        else return Calculate(x, n/2) * Calculate(x, n/2) * x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and its power: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = Calculate(x, n);
        System.out.println(result);
        sc.close();
    }
}
