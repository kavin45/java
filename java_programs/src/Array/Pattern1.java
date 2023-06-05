package Array;

public class Pattern1 {
	
	public static void main(String args[])
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==1) || (i==5) || (j==1) || (j==5))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
	
		System.out.println();
	int n1=7;
	System.out.println("Print 7th table");
	for(int i=1;i<=10;i++)
	{
		int c=n1*i;
		System.out.println(n1+" "+ "*" +" "+i+" ="+c);
	}
	
	System.out.println();
	int a[]= {3,1,7,5,2};
	int b[]=new int[a.length];
	System.out.println("given array : ");
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
		System.out.print(" "+b[i]);
		
	}
	System.out.println();
	System.out.println("reverse array : ");
	for(int i=b.length-1;i>=0;i--)
	{
		System.out.print(" "+b[i]);
	}
	
	
	
	}
}








