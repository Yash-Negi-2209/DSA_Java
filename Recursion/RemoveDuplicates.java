
import java.util.*;
public class RemoveDuplicates {

    public static boolean arr[] = new boolean[26];

    public static void Remove(String str, int index, String newstr){
        
        if (index==str.length()){
        System.out.print(newstr);
        return;
        }

        char currchar = str.charAt(index);
        if (arr[currchar-'a']){                     //this means arr[currchar-'a'] = true;
            Remove(str, index+1, newstr);
        }
        else{
            newstr += currchar;
            arr[currchar-'a'] = true;
            Remove(str, index+1, newstr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        Remove(str, 0, "");
        sc.close();
    }
}
