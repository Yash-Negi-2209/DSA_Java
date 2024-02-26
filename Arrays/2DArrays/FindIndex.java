
import java.util.*;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        System.out.println("Enter the elements: ");

        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter a number to be searched in the matrix: ");
        int num=sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if (matrix[i][j]==num){
                    System.out.println("Number found at index: ("+i+","+j+")");
                }
            }
        }
        sc.close();
    }
}
