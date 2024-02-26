
import java.util.*;
public class TowerOfHanoi{

    public static void Hanoi(int n, String src, String help, String dest){
        if (n==1){
            System.out.println("Transfer "+n+" from "+src+" to "+dest);
            return;
        }
        Hanoi(n-1, src, dest, help);
        System.out.println("Transfer "+n+" from "+src+" to "+dest);
        Hanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Disks: ");
        int num = sc.nextInt();
        Hanoi(num, "S", "H", "D");
        sc.close();
    }
}