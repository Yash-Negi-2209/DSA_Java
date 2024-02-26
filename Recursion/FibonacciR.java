
import java.util.*;
public class FibonacciR{

    public static void Fibo(int a, int b, int n){
        if (n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        Fibo(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tern till where fibonacci series has to be printed: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        Fibo(0, 1, num-2);
        sc.close();
    }
}