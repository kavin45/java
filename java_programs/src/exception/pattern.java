package exception;

public class pattern {
	public static void main(String[] args) 
	{
		pattern obj=new pattern();
		obj.plus();
		obj.star();
		obj.num();
		obj.butterfly();
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

	
   //   1
   // 2 1
  //3 2 1
	public void num()
	{
	
		
		for(int i=1;i<=3;i++)
		{
         for(int space =3;space>i;space--)
         {
        	 System.out.print("_");
         }
		  for(int j=i;j>=1;j--)
		  {
			  System.out.print(j);
		  }
		  System.out.println();
		}
	}
	
	
		public void butterfly()
		{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=5;k>i;k--)
			{
				System.out.print("_");
			}
			System.out.println();
		}
		
	

	
	}
}

