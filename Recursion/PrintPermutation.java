import java.util.*;
public class PrintPermutation{

    public static void PrintPer(String str, String permutation){

        if (str.length()==0){
            System.out.println(permutation);
            return;
        }

        for( int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            PrintPer(newstr, permutation+currchar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        PrintPer(str, "");
        sc.close();
    }
}