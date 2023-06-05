package Array;

import java.util.Scanner;

public class duplicate_array_elements {

	public static void main(String[] args) 
	{
		duplicate_array_elements obj=new duplicate_array_elements();
		obj.spilit();
     }
	public void spilit()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array Size : ");	
		int size=s.nextInt();
	    int a[]=new int[size];
	    System.out.println("please enter " + size + " array value");
		for(int i=0;i<a.length;i++)
		{
			a[i] =s.nextInt();	
		}
		System.out.println();
		System.out.println("Display the Array elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i)+".Index Element = "+a[i]);
		}
		
	    int i;
	    int j;
	    //boolean flag=false;
	    int n=Integer.MIN_VALUE;
	    int count=0;
		for( i=0;i<a.length;i++)
		{
			
           for( j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{ 
					count++;
					a[j]=n;
					System.out.println("duplicte "+a[i]+" "+count);
					n++;
										
				}
			}
		}
	
				
				if(count>1)
				{
					System.out.println("Duplicate is present count  = " +count);
				}
				else
				{
					System.out.println("duplicate not found");
				}
			
		
		
	
		
	}

}
