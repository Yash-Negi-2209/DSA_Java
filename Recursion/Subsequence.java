
import java.util.*;
public class Subsequence {

    public static void Subs(String str, int index, String newstr){

        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        
        char currchar = str.charAt(index);
        
        // To be:
        Subs(str, index+1, newstr+currchar);

        // Not to be part of:
        Subs(str, index+1, newstr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Subs(str, 0, "");
        sc.close();
    }
}
