package Array;
import java.util.Scanner;
public class Array_students {
	public static void main(String args[])
	{
	  
   		 stud_age();
	}
	static void stud_age()
	{
		//get array value in runtime
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students : " );
		int n = sc.nextInt();//number of persons in run time
		int a[]=new int[n];//array object creation
	     System.out.println("Enter the age of students : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();//number of ages in runtime
		}
		//display the persons ages
		System.out.println();
		System.out.println("Display the students Age : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+".Student age = "+a[i]);
		}
		//sum of ages 
		System.out.println();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of age's of Students = " +sum);
		//Average of ages
		System.out.println();
		int avg=0;
		for(int i=0;i<a.length;i++)
		{
			avg=sum/a.length;
		}
		System.out.println("Average of age's of students = "+avg);
		System.out.println();
		//reverse order of students age
		System.out.println("Reverse order of students ages:");
	
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println((i+1)+".Student age = "+a[i]);
		}
		
		sc.close();
		
		
	}
	

}
