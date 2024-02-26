import java.util.*;

public class Factorial {
    public static int Fact(int num){
        int prod=1;
        for(int i=1; i<=num; i++){
            prod=prod*i;
        }

        if (num==0){
            System.out.println("Factorial= 1");
        }
        else if (num<0){
            System.out.println("Factorial of negative numbers cannot be calculated.");
        }
        else{
            System.out.println("Factorial= "+prod);
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till where factorial has to be printed: ");
        int n=sc.nextInt();
        Fact(n);
        sc.close();
    }
}
