package com.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber
{
	public static void main(String[] args)
	{
		double n;
 	    Scanner sc = new Scanner(System.in);
		System.out.print("enter n :");
		n=sc.nextDouble();
		double h=harmonicNum(n);
		System.out.println("Harmonic number" +h);
	}
	static double harmonicNum(double n)
	{
		double harNum = 0;
		for(double i=1; i<=n; i++)
	    	{
			harNum = harNum + (1/i);
	    	}
			return harNum;
		 	}
	}
	


