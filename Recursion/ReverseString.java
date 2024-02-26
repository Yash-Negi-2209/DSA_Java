
import java.util.*;
public class ReverseString {

    public static void Reverse(String str, int index){

        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        Reverse(str, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Reverse(str, str.length()-1);
        sc.close();
    }
}
