
import java.util.*;
public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = sc.nextLine();
        String result= str.replace('e','i');
        System.out.println(result);
        sc.close();
    }
}
