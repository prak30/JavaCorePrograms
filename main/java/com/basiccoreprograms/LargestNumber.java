package com.basiccoreprograms;

import java.util.Scanner;

public class LargestNumber
{
	public static void main(String[] args)
	{
		int num1, num2, num3;
 	    Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number :");
		num1=sc.nextInt();
		System.out.print("enter 2nd number :");
		num2=sc.nextInt();
		System.out.print("enter 3rd number :");
		num3=sc.nextInt();
		isLargest(num1,num2,num3);
	}
	public static void isLargest(int num1,int num2,int num3)
	{
		if(num1>num2 && num1>num3)
			System.out.println("1st number is the largest");
		else if(num2>num1 && num2>num3)
			System.out.println("2nd number is the largest");
		else 
			System.out.println("3rd number is the largest");
	}

}
