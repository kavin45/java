package forloop;

public class Star_patterns_in_forloop {

		public static void main(String args[])
		{
			Star_patterns_in_forloop obj = new  Star_patterns_in_forloop();
		obj.patt();
		obj.patt1();
		obj.patt2();
		obj.patt3();
		obj.patt4();
		obj.patt5();
		obj.patt6();
		obj.patt7();
		obj.patt8();
		obj.patt9();
		obj.patt10();
		

	}
		//*****
		//*****
		//*****
		//*****
		//*****

		public void patt() {
			
			for(int row=1;row <= 5;row++) {
				
				for(int col=1;col <= 5;col++) {
					System.out.print("*");
					
				}
				
				System.out.println();
			}
		}
		
		//0***0
		//0***0
		//0***0
		//0***0
		//0***0
		public void patt1() {
			
			for(int row=1;row <= 5;row++) {
				for(int col=1;col <= 5;col++) {
					if(col==1 || col==5)
					{
					System.out.print(0);
					}
					else
					{
						System.out.print("*");
					}
				
					
					
				}
				
				System.out.println( "");
				
			}
		}
		
		public void patt2() {
			
			for(int row=1;row<=5;row++)
			{
				
				for(int space=5;space>row;space--)
				{
					System.out.print("_");
					
				}
			
				for(int col=1;col<=row;col++)
				{
					System.out.print(col);
				}
			
				System.out.println();
			}
				
			}
			public void patt3()
			{
				for(int row=1;row<=5;row++)
				{
					for(int col=5;col>=row;col--)
					{
						System.out.print(row);
						
					}
					System.out.println( " ");
				}
			}
			public void patt4()
			{
				for(int row=1;row<=5;row++)
				{
					for(int col=5;col>=row;col--)
					{
						System.out.print("*");
						
					}
					System.out.println(" ");
				}
			}
			
			
			public void patt5()
			{
				for(int row=1;row<=5;row++)
				{
					for(int space=1;space<row;space++)
					{
						System.out.print("_");
						
					}
					for(int col=5;col>=row;col--)
					{
					System.out.print("*");
					}
					System.out.println();
				
				}
			}
			
			public void patt6()
			{
				for(int row=1;row<=5;row++)
				{
					for(int space=5;space>row;space--)
					{
						System.out.print("_");
						
					}
					for(int col=1;col<=row;col++)
					{
						
					System.out.print("*");
					}
					System.out.println();
				
				}
			}
			public void patt7()
			{
				
				for(int row=5;row>1;row--)
				{
					
					for(int col=1;col<=row;col++)
					{
						
						if(col%2!=0)
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
			}
			public void patt8()
			{
				int a=1;
				for(int row=1;row<=5;row++)
				{
					
					for(int space=5;space>row;space--)
					{
						System.out.print("_");
						
					}
					for(int col=1;col<=a;col++)
					{
						
						
					System.out.print("*");
					}
					a=a+2;
					System.out.println();
				
				}
				}
			
			
public void patt9()
{
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=row;col++)
		{
			
		System.out.print("*");
		}
		for(int space=1;space>row;space++)
		{
			System.out.print("_");
			
		}
	
		System.out.println();
	
	}

}
public void patt10()
{
	char a='A';
	for(int row=1;row<=4;row++)
	{
		for(int col=1;col<=4;col++)
		{
			
		System.out.print(a+ " ");
		}
		a++;
	
		System.out.println();
	
	}

}
}

		
	



