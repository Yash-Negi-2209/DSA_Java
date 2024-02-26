import java.util.*;


public class HollowRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int x = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int y = sc.nextInt();

        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++){
                if (i==1 || j==1 || i==x || j==y){
                    System.out.print("*");
                }
                else 
                System.out.print(" ");
            }
            System.out.println( );
        }
        sc.close();
    }
}
