
import java.util.*;
public class SumNaturalNo{

    public static void Sum(int i, int n, int sum){
        if (i>n){
            System.out.println("Sum is: "+sum);
            return;
        }
        sum+=i;
        Sum(i+1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the sum upto it: ");
        int num = sc.nextInt();
        Sum(1,num,0);
        sc.close();
    }
}
