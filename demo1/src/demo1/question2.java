package demo1;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num value");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
