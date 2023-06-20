package Array;

import java.util.Scanner;

public class add_remove_element 
{
	public static void main(String args[])
	{
		add_remove_element obj=new add_remove_element();
	Static.size();
	Static.element();
	Static.display();
	obj.remove();
	obj.remove_index();
	obj.add_element();
	
	}
	public void remove()
	{
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number to remove : ");
		int n=s.nextInt();
		int b[]=Static.a;
		int c[]=new int[b.length-1];
		int temp=0;
		System.out.println();
		System.out.println("After remove the element : ");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=n)
			{
				System.out.println(c[temp]=b[i]);
				temp++;
			}
		}
		System.out.println();
		s.close();
		}
	public void remove_index()
	{
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number to remove index : ");
		int n=s.nextInt();
		int b[]=Static.a;
		int c[]=new int[b.length-1];
		int temp=0;
		System.out.println();
		System.out.println("After remove the index : ");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=b[n])
			{
				System.out.println(c[temp]=b[i]);
				temp++;
			}
		}
		s.close();
		System.out.println();
	}
	public void add_element()
	{
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the index to add : ");
		int n=s.nextInt();
		System.out.println("Enter the number to add : ");
		int m=s.nextInt();
		int b[]=Static.a;
		int c[]=new int[b.length+1];
		int temp=0;
		for(int i=0;i<c.length;i++)
		{
		if(n==i)
		{
			c[i]=m;
		}
		if(n!=i)
		{
			c[i]=b[temp];
			temp++;
		}
	}
		System.out.println();
		System.out.println("After changing value ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(" "+c[i]);
		}
		s.close();
}
}
