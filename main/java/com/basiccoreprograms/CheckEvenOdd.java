package com.basiccoreprograms;

import java.util.Scanner;

public class CheckEvenOdd 
{
	public static void main(String[] args)
	{
		int n;
 	    Scanner sc = new Scanner(System.in);
		System.out.print("enter n :");
		n=sc.nextInt();
		operation(n);
 	}
	public static void operation(int n)
	{
		if(n%2 == 0)
		System.out.println(+n+" is even");
		else 
		System.out.println(+n+" is odd");
	}
		
}



