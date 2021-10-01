package com.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo 
{
	public static void main(String[] args)
	{
		int n;
 	    Scanner sc = new Scanner(System.in);
		System.out.print("enter n :");
		n=sc.nextInt();
 	    power(n);
	}
 	    public static void power(int n)
 	    {
 	    	for(int i =1; i<=n; i++)
 	    	{
 	    		System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));
 	    	}
 	    }
 	    
	}


