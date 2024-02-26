import java.util.*;

public class InvertedHalf180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int x = sc.nextInt();

            for(int i=1; i<=x; i++){
                for(int j=1; j<=x-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println( );
            }
            sc.close();
    }
}
