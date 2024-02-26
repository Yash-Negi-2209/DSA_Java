
import java.util.*;
public class Tiles {

    public static int Place(int rows, int columns){

        if (rows==columns){
            return 2;
        }
        if (rows<columns){
            return 1;
        }

        int verticalPlacements = Place(rows-columns, columns);
        int horizontalPlacements = Place(rows-1, columns);
        return verticalPlacements+horizontalPlacements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int result = Place(rows, columns);
        System.out.println(result);
        sc.close();
    }
}
