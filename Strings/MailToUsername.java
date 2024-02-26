
import java.util.*;
public class MailToUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mail ID: ");
        String str = sc.nextLine();
        String okay = "";
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == '@'){
                int num = i;
                okay = str.substring(0,num);  
            } 
        }
        System.out.println("Username is: "+okay);
        sc.close();
    }
}
