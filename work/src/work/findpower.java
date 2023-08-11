package work;

import java.util.Scanner;

public class findpower
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for base");
		int base=scan.nextInt();
		System.out.println("Enter the value for Exponent");
		int exponent=scan.nextInt();

	    long result = 1;

	    while (exponent != 0)
	    {
	      result *= base;
	      --exponent;
	    }

	    System.out.println("Answer = " + result);
	}
}