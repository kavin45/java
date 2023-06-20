package Array;

import java.util.Scanner;

public class Static {
	static int size;
	static int a[];
	public static void main(String[] args) 
	   {
		size();
		element();
		display();
		}                   
	public static  void size()
	{
		Scanner s=new Scanner(System.in);  
		System.out.println("Enter the array Size : ");	
 	    a=new int[size];
	   // s.close();
	    
	}
	public static void element()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter " + size + " array value");
		for(int i=0;i<a.length;i++)
		{
			a[i] =s.nextInt();	
		}
		//s.close();
	}
	public  static void display()
	{
		System.out.println();
		System.out.println("Display the Array elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i)+".Index Element = "+a[i]);
		}
		
	}
	

}
