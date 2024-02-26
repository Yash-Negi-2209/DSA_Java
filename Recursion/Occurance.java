
import java.util.*;
public class Occurance {

    public static int first = -1;
    public static int last = -1;

    public static void Occ(String str, int index, char ch){
        
        if (index==str.length()){
            System.out.println("First Index: "+first);
            System.out.println("Last Index: "+last);
            return;
        }
        if (str.charAt(index)==ch){
            if (first==-1){
                first=index;
            }
            else last=index;
        }

        Occ(str, index+1, ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the element you want to check the first and last occurance: ");
        char ch = sc.next().charAt(0);     // char input ese lete hai kyuki Scanner class does not include nextChar().

        Occ(str, 0, ch);

        sc.close();
    }
}
