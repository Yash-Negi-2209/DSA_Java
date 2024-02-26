
import java.util.*;
public class KeypadCombo {

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void Nokia(String str, int index, String newstr){

        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        String mapping = keypad[currchar-'0'];
        for (int i=0; i<mapping.length(); i++){
            Nokia(str, index+1, newstr+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a combination: ");
        String str=sc.nextLine();
        Nokia(str, 0, "");
        sc.close();
    }
}
