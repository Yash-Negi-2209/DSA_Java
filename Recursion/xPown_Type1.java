
import java.util.*;
public class xPown_Type1 {

    public static int Calculate(int x, int n){

        if ( x==0){
            return 0;
        }
        else if (n==0){
            return 1;
        }
        int xPownm1 = Calculate(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
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
