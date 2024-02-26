import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        System.out.println("Transpose of the above matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println( );
        }
        sc.close();
    }

        
}

