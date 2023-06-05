package Array;

import java.util.Scanner;

public class Array_diff_sum_of_odd_even {
	public static void main(String args[])
	{
		odd();
	}

	static void odd()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		int n =sc.nextInt();
		
		int arr[]= new int[n];
		
		System.out.println("please enter " + n + " array value");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =sc.nextInt();	
		}
		System.out.println("Even numbers in array format : ");
		int odd=0;
		int even=0;
	    for(int i=0;i<arr.length;i++) {
	    
	    	if(arr[i]%2==0)
	    	{
	    		System.out.println(i + " index value is  "+ arr[i]);
	    		even=even+arr[i];
	    	}
	    }
	    System.out.println("Odd numbers in array format : ");
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		if(arr[i]%2!=0)
	    		{
	    	        System.out.println(i+" index value is "+ arr[i]);
	    	        odd=odd+arr[i];
	    		}
	        
	    	}  
	    	int sum=0;
	        sum=odd+even;
	    	System.out.println("Sum of odd and even numbers in array format : "+sum);
	    	int diff=0;
           diff=even-odd;
           System.out.println("diff of odd and even numbers in array format : "+diff);
	        sc.close();
	    	}  
		

	}

	

