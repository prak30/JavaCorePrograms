package com.basiccoreprograms;

import java.util.Scanner;

public class WindChill
{
	public static final double a = 35.75;
	public static void main(String[] args)
	{
	int t,v;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter temperature(in fahrenheit)(<50):");
	t=sc.nextInt();
	System.out.print("enter wind speed(miles/hr)(between 3-120):");
	v=sc.nextInt();
	windChill(t,v);
	}
	public static void windChill(int t,int v)
	{
		double k = Math.pow(0.16,v);
		if(v<=120 && v>=3 && t<=50)
		{
			double w = a + 0.6215*t + k*(0.4275*t - a);
			System.out.println("wind chill is " +w);	
		}
		else
			System.out.println("invalid");
		
	}
	

}
