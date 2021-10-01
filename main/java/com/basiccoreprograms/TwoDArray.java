package com.basiccoreprograms;

import java.util.Scanner;

<<<<<<< HEAD
public class TwoDArray 
=======
public class TwoDArray
>>>>>>> 2DArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
		System.out.println("Enter number of Rows:");
		int row = sc.nextInt();
		System.out.println("Enter number of Columns:");
=======
		System.out.println("Enter number of Rows");
		int row = sc.nextInt();
		System.out.println("Enter number of Columns");
>>>>>>> 2DArray
		int column = sc.nextInt();
		int array[][] = new int[row][column];
		int i,j;
		for(i=0; i<row; i++)
		{
			for(j=0; j<column; j++)
			{
<<<<<<< HEAD
				System.out.println("Enter element of array");
=======
				System.out.println("Enter values in array");
>>>>>>> 2DArray
				int values = sc.nextInt();
				array[i][j] = values;
			}
		}
		System.out.println("your array");
		for(i=0; i<row; i++)
		{
<<<<<<< HEAD
			
=======
>>>>>>> 2DArray
			System.out.println();
			for(j=0; j<column; j++)
			{	
				System.out.print(" " + array[i][j]);
			}
<<<<<<< HEAD
		}
	}
}

	





=======

		}
	}


	
}
>>>>>>> 2DArray


