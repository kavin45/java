package _2d_array;

import java.util.Scanner;

public class merge_array {

	public static void main(String[] args) {
		merge_array obj=new merge_array();
		int a[][]=obj.first();
		int b[][]=obj.second();
		obj.sum(a, b);
		obj.multi(a, b);
	}
	public int[][] first()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the row size ");
		int row=s.nextInt();
		System.out.println("enter the col size ");
		int col=s.nextInt();
		System.out.println("enter array values ");
		int a[][]=new int [row][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		System.out.print(a[i][j]+" ");
		
			}
			System.out.println();
	    }
		s.close();
		return a;
	}
	public int[][] second()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the row size ");
		int row=s.nextInt();
		System.out.println("enter the col size ");
		int col=s.nextInt();
		System.out.println("enter array values ");
		int b[][]=new int [row][col];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
		System.out.print(b[i][j]+" ");
		
			}
			System.out.println();
			 }
		s.close();
		return b;
	}
	//sum the array
	public void sum(int a[][],int b[][])
	{
		int c[][]=new int [a.length][a[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of two array");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
	    }
}
	public void multi(int a[][],int b[][])
	{
		int c[][]=new int [a.length][a[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("multi of two array");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
	    }
}
}
