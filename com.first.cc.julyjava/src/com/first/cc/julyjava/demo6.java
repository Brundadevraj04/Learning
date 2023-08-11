package com.first.cc.julyjava;

import java.util.Scanner;

public class demo6 {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		    System.out.println("Enter your student n1 height");
		    int n1=scan.nextInt();
		    System.out.println("Enter your student n2 height");
		    int n2=scan.nextInt();
		    System.out.println("Enter your student n3 height");
		    int n3=scan.nextInt();
	 
	        if (n1 >= n2) {
	            if (n1 >= n3)
	                System.out.println("Student with height: " + n1 + " is the tallest.");
	            else
	                System.out.println("Student with height: " + n3 + " is the tallest.");
	        } else {
	            if (n2 >= n3)
	                System.out.println("Student with height: " + n2 + " is the tallest.");
	            else
	                System.out.println("Student with height: " + n3 + " is the tallest.");
	        }
	        System.out.println("\n");
	    }
	}
