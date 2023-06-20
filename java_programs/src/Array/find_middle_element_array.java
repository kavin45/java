package Array;

import java.util.Scanner;

public class find_middle_element_array {
	static int size;
	static int a[];

	public static void main(String[] args) {
		
		find_middle_element_array obj=new find_middle_element_array();
		size();
		element();
		display();
		obj.middle_element();
		
	}
	public static  void size()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array Size : ");	
		size=s.nextInt();
	    a=new int[size];
	    s.close();
		
	}
	public static void element()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter " + size + " array value");
		for(int i=0;i<a.length;i++)
		{
			a[i] =s.nextInt();	
		}
		s.close();
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
		public void middle_element()
		{
				if(a.length%2!=0)
				{
				int x=a.length/2;
				System.out.println("middle element : "+a[x]);
				}

				if(a.length%2==0)
				{
				int i=a.length/2;
				System.out.println("middle element : "+a[i]+" "+a[i-1]);
				}
				System.out.println("first element " +a[0]);
				System.out.println("last element " +a[a.length-1]);
				
				
				
			
		}
		
	}













 
