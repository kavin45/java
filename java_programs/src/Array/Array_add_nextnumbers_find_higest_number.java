package Array;

import java.util.Scanner;

public class Array_add_nextnumbers_find_higest_number {
	
	public static void main(String args[])
	{
		find();
	}
	static void find()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		int n =sc.nextInt();
		
		int a[]= new int[n];

		System.out.println("please enter " + n + " array value");
		for(int i=0;i<a.length;i++)
		{
			a[i] =sc.nextInt();	
		}
		
	// Add first two value and set its max
    // Then using Loop to add next two value's and it's goes to till end
    // Checking (IF-condition) to first max is greater or second max is greater
int max = a[0]+a[1];  
for(int i=1;i<a.length-1;i++)
{
  int max1 = a[i] + a[i+1];

  if(max < max1)  
  {
    max =max1;
  }
     
}

System.out.println("Largest ADDITION of two value's in given array "+max);
sc.close();
}
}
