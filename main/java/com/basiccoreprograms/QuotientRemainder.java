package com.basiccoreprograms;

import java.util.Scanner;

public class QuotientRemainder
{
	public static void main(String[] args)
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number :");
		num1=sc.nextInt();
		System.out.print("enter 2nd number :");
		num2=sc.nextInt();
		getQuotient(num1,num2);
		getRemainder(num1,num2);
	}
	public static void getQuotient(int num1 , int num2)
	{
		int quotient = num1/num2;
		System.out.println("quotient:" +quotient);	
	}
	public static void getRemainder(int num1 , int num2)
	{
		int remainder = num1%num2;
		System.out.println("remainder" +remainder);
	}
}
