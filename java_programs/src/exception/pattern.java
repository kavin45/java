package exception;

public class pattern {
	public static void main(String[] args) 
	{
		pattern obj=new pattern();
		obj.plus();
		obj.star();
	}
    //0
	//+1
	//++2
	public void plus()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					System.out.println(i);
					break;
				}
					System.out.print("+");
			}
			}
		}
	public void star()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print("_");
			}
		System.out.println();
		}
	}
	public void  star1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print("_");
			}
		System.out.println();
		}
	}
	
	
	}


