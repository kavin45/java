package concepts;

import java.util.Scanner;

public class Armstrong {
 
		
		public static void main(String args[])
		{
		Armstrong obj=new Armstrong();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number = ");
		int n=s.nextInt();
		obj.check(n);
		s.close();
		obj.patt();
		}
		public void check(int n)
		{ 
		
		 int num=n;
		  int sum=0;
		 while(n>0)
		{
		int a=n%10;
		int mod_value=a*a*a;
		sum=sum+mod_value;
		n=n/10;
		}
		if(num==sum)
		{
		System.out.println("armstrong");
		}
		else
		{
		System.out.println("not armstrong");
		}
		}
		
public void patt()
{
	int a=1;
	for(int row=1;row<=3;row++)
	{
		
		for(int space=3;space>row;space--)
		{
			System.out.print("_");
			
		}
		for(int col=1;col<=a;col++)
		{
			
			
		System.out.print(col);
		}
		a=a+2;
		System.out.println();
	
	}
}
}






