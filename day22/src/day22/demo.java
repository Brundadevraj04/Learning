package day22;

import java.util.Scanner;

public class demo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the score");
		int score=scan.nextInt();
		grade g1=new grade();
		g1.gradegiven(score);
	}
}