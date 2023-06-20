package _2d_array;

import java.util.Scanner;

public class transpose {
	public static void main(String args[])
	{
		transpose obj=new transpose();
		int a[][]=obj.first();	
		obj.trans(a);
		obj.transpose1(a);
		
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
	public void trans(int a[][])
	{
		int b[][]=new int [a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		System.out.println("transpose of given array");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
		System.out.print(b[i][j]+" ");
		
			}
			System.out.println();
	    }
	}
	public void transpose1(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		System.out.println("transpose of given array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		System.out.print(a[i][j]+" ");
		
			}
			System.out.println();
	    }
	}
}
