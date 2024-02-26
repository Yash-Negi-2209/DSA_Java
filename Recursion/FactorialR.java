
import java.util.*;

public class FactorialR {
    
    public static int Fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        int fac_nm1 = Fact(n-1);
        int fact_n = n * fac_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till where factorial has to be printed: ");
        int num=sc.nextInt();
        int result = Fact(num);
        System.out.println(result);
        sc.close();
    }
}
