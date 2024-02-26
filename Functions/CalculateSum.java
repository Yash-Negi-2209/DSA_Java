import java.util.Scanner;

public class CalculateSum{

    public static float Cal_Sum(float a, float b){
        float sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        
        float sum=Cal_Sum(x,y);
        System.out.println("Sum is :"+sum);
        sc.close();
    }
}