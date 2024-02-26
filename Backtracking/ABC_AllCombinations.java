import java.util.*;
public class ABC_AllCombinations{

    public static void printPermutation(String str, String perm, int index){

        if (str.length()==0){
            System.out.println(perm);
        }

        for (int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newstr, perm+currchar, index+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        printPermutation(str, "", 0);
        sc.close();
    }
}