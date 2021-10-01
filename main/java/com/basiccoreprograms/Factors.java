package com.basiccoreprograms;

import java.util.Scanner;

public class Factors
{
	public static void main(String[] args)
	{
		int n;
 	    Scanner sc = new Scanner(System.in);
		System.out.print("enter the number whose factors you want to find:");
		n=sc.nextInt();
		System.out.println("Prime factors are");
		primeFactors(n);
		sc.close();
	}
	
	public static void primeFactors(int n)
	{
		for(int i = 2; i <= n; i++)
		{
			while(n%i == 0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
	}
}
