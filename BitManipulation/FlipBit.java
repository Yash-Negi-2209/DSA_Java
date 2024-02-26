
import java.util.*;
public class FlipBit {

    static int Flip(int num, int bit){
        int Bitmask = 1<<bit;
        int result = (num ^ Bitmask);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the position of bit you want to flip: ");
        int bit = sc.nextInt();

        System.out.println("The number after flipping the "+bit+" bit is :"+Flip(num, bit));
        sc.close();
    }
}
