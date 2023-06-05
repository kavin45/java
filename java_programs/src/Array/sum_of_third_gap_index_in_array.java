package Array;

import java.util.Scanner;

public class sum_of_third_gap_index_in_array {
	

	public static void main(String[] args) 
	{
		sum_arr();
	}
 	static void sum_arr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("please enter " + n + " array value");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
			System.out.println();
			System.out.println("Display the Array elements : ");
			for(int i=0;i<a.length;i++)
			{
				System.out.println((i+1)+".Element = "+a[i]);
			}
			//System.out.println("start with index element : ");
			//int c = sc.nextInt();
			int sum=0;
			System.out.println();
			for(int i=1;i<a.length;i=i+3)//sum the third to third element
			{
				sum=sum+a[i];
			}
			System.out.println("Sum of 1 the elements = "+sum);
			for(int i=2;i<a.length;i=i+3)//start with index 2
			{
				sum=sum+a[i];
			}
			System.out.println("Sum of 2 the elements = "+sum);
			for(int i=3;i<a.length;i=i+3)//start with index 3
			{
				sum=sum+a[i];
			}
			System.out.println("Sum of 3 the elements = "+sum);
			sc.close();
		}

	}


