package _2d_array;
import java.util.Scanner;

public class sum_row {

	public static void main(String[] args) 
	{
		sum_row obj=new sum_row();
		obj.sum();
		

	}
	public void sum()
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
		
     // separate row total values
	System.out.println();
	for(int i=0;i<a.length;i++)
	{
		int sum=0;
		for(int j=0;j<a[i].length;j++)
		{
			sum=sum+a[i][j];
		}
		System.out.println("row values : "+sum);
	}
	//  row total values
		System.out.println();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("row values : "+sum);
		s.close();
	}
}
