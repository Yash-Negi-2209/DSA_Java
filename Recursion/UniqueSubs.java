
import java.util.*;
public class UniqueSubs {

    public static void Subs(String str, int index, String newstr, HashSet<String> set){

        if(index == str.length()){
            if(set.contains(newstr)){
                return;
            }
            else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        
        char currchar = str.charAt(index);
        
        // To be:
        Subs(str, index+1, newstr+currchar, set);

        // Not to be part of:
        Subs(str, index+1, newstr, set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        HashSet<String> set = new HashSet<>();
        Subs(str, 0, "", set);
        sc.close();
    }
}
