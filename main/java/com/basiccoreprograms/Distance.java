package com.basiccoreprograms;

import java.util.Scanner;

public class Distance 
{
	public static final int X = 0;
	public static final int Y = 0;
	
	public static void main(String[] args)
	{
		double x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter x coordinate :");
		x=sc.nextDouble();
		System.out.print("enter y coordinate :");
		y=sc.nextDouble();
		findDistance(x,y);
	}
	public static void findDistance(double x, double y)
	{
		double k = Math.pow(2,x-X);
		double m = Math.pow(2,y-Y);
		double lineLength=Math.sqrt(k + m);
        System.out.println("distance= " +lineLength);
		
	}
}
