package com.basiccoreprograms;

import java.util.Scanner;

public class SwapNumber
{
	public static void main(String[] args)
	{
		int num1, num2;
 	    Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number :");
		num1=sc.nextInt();
		System.out.print("enter 2nd number :");
		num2=sc.nextInt();
		swap(num1,num2);
	}
	public static void swap(int num1,int num2)
	{
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swap " +num2+ " is swapped to " +num1);
	}

}
