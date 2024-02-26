
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows and columns:");
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        System.out.println("Enter the elements: ");

        int matrix[][] = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        int sum=0;

        int rowstart = 0;
        int rowend = rows-1;
        int colstart = 0;
        int colend = columns-1;

        while( rowstart<=rowend && colstart<=colend){

            for(int col=colstart; col<=colend; col++){
                System.out.print(matrix[rowstart][col]+" ");
                sum=sum+matrix[rowstart][col];
            }
            rowstart++;

            for( int row=rowstart; row<=rowend; row++){
                System.out.print(matrix[row][colend]+" ");
                sum=sum+matrix[row][colend];
            }
            colend--;

            for (int col=colend; col>=colstart; col--){
                System.out.print(matrix[rowend][col]+" ");
                sum=sum+matrix[rowend][col];
            }
            rowend--;

            for (int row=rowend; row>=rowstart; row--){
                System.out.print(matrix[row][colstart]+" ");
                sum=sum+matrix[row][colstart];
            }
            colstart++;

            System.out.println( );
        }
        System.out.println("Sum of spiral matrix is: "+sum);
        sc.close();
    }
}
