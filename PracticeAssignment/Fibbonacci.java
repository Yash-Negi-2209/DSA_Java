import java.util.*;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till where fibonacci series has to be printed: ");
        int num=sc.nextInt();

        int pre=0;
        int curr=1;
        System.out.print(pre+" ");
        System.out.print(curr+" ");
        
        for (int i=1; i<=num; i++){
            
            int next=pre+curr;
            System.out.print(next+" ");
            pre=curr;
            curr=next;
        }
        sc.close();
    }
}
