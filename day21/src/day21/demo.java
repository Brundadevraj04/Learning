package day21;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=scan.nextInt();
		System.out.println("welcome to kodnest");
		check(marks);
	}
	public static void check(int marks)
	{
		if(marks>=80)
		{
			System.out.println("welcome to techclub");
		}
	}

}