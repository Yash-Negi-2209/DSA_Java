// Java program to Decimal to binary conversion
// using bitwise operator
// Size of an integer is assumed to be 32 bits

import java.util.*;

class DecimalToBinary {

    static void decToBinary(int n)
	{
		// Size of an integer is assumed to be 32 bits
		for (int i = 31; i >= 0; i--) {
			int k = n >> i;
			if ((k & 1) > 0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}


	// driver code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to convert into binary: ");
		int n = sc.nextInt();

		System.out.println("Decimal: " + n);
		System.out.print("Binary: ");
        decToBinary(n);
		sc.close();
	}
}
