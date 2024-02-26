
// Leetcode me yahi same problem dp approach se kari hai, dekh lena..

import java.util.*;
public class PathsInMaze {

    public static int CountPaths(int i, int j, int rows, int columns){

        if (i==rows || j==columns){
            return 0;
        }
        if (i==rows-1 && j==columns-1){
            return 1;
        }

        int downpaths = CountPaths(i+1, j, rows, columns);
        int rightpaths = CountPaths(i, j+1, rows, columns);
        return downpaths+rightpaths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int result = CountPaths(0, 0, rows, columns);
        System.out.println(result);
        sc.close();
    }
}