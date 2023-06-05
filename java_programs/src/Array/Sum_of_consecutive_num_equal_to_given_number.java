package Array;

import java.util.Scanner;

public class Sum_of_consecutive_num_equal_to_given_number {
	
	public static void main(String args[])
	{
		Sum_of_consecutive_num_equal_to_given_number obj=new Sum_of_consecutive_num_equal_to_given_number();
		Static.size();
		Static.element();
		Static.display();
		obj.sum_number1();
	}public void sum_number1()
		{
			
		     Scanner s=new Scanner(System.in);
			int b[]=Static.a;
			System.out.println("Enter a value : ");
			int x=s.nextInt();
			boolean flag=false;
			for(int i=0;i<b.length-1;i++)
			{
			   for(int j=i+1;j<b.length;j++)
				{
					int sum=b[i]+b[j];
					if(sum==x)
					{
						System.out.println("Sum of number equal to given number : "+b[i]+"+ "+b[j]+"="+sum);
						flag=true;
				
					}
					break;
				}
			}
					if(flag==false)
					{
						System.out.println("Not a sum of a array : "+x);
					}
				
	}
	
	
}
