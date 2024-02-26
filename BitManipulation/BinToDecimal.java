
import java.util.*;
public class BinToDecimal {

        static void binaryToDecimal(int n)
        {
            int dec_num = 0;
            int power = 0;
            while (n > 0) {
            if (n % 10 == 1) {
                dec_num += (1 << power);
            }
            power++;
            n = n / 10;
            }
            System.out.println(dec_num);
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();
        binaryToDecimal(num); 
        sc.close();
    }
}
