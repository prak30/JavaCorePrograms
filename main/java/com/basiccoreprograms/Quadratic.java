package com.basiccoreprograms;

import java.util.Scanner;

public class Quadratic
{	
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a :");
		a=sc.nextInt();
		System.out.print("enter b :");
		b=sc.nextInt();
		System.out.print("enter c :");
		c=sc.nextInt();
		getRoots(a,b,c);
	}
	public static void getRoots(int a,int b,int c)
	{
		double delta = (b*b)-(4*a*c);
	    double sqrt = Math.sqrt(delta);
	    if(delta>0)
	      {
	         double firstRoot = (-b + sqrt)/(2*a);
	         double secondRoot = (-b - sqrt)/(2*a);
	         System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
	      }
	      else if(delta == 0)
	      {
	         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
	      }
	         else
	        	 System.out.println("no real roots");
	      
	      
	}
}
		
	

	


