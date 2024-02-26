import java.util.*;
public class MoveAtLast{

    public static void Move(String str, int index, int count, String newstr, char ch){
        
        if (index==str.length()){
            for(int i=0; i<count; i++){
                newstr += ch;
            }
            System.out.println(newstr);
            return;
        }
        char currchar =  str.charAt(index);
        if(currchar==ch){
            count++;
            Move(str, index+1, count, newstr, ch);
        }
        else{
        newstr += currchar;
        Move(str, index+1, count, newstr, ch);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to move at last: ");
        char ch = sc.next().charAt(0);
        Move(str, 0, 0, "", ch);
        sc.close();
    }
}