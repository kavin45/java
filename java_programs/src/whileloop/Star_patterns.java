package whileloop;

public class Star_patterns 
{
	public static void main(String args[])
	{
	Star_patterns obj = new  Star_patterns();
	obj.patt();
	obj.patt1();
	obj.patt2();
	obj.patt3();
	obj.patt4();
	obj.patt5();

}
	//*****
	//*****
	//*****
	//*****
	//*****

	public void patt() {
		int row = 1;
		while (row <= 5) {
			int col = 1;
			while (col <= 5) {
				System.out.print("*");
				col++;
			}
			row++;
			System.out.println();
		}
	}
	
	//0***0
	//0***0
	//0***0
	//0***0
	//0***0
	public void patt1() {
		int row = 1;
		while (row <= 5) {
			int col = 1;
			while (col <= 5) {
				if(col==1 || col==5)
				{
				System.out.print(0);
				}
				else
				{
					System.out.print("*");
				}
			
				col++;
				
			}
			row++;
			System.out.println( "");
			
		}
	}
	
	public void patt2() {
		
		for(int row=1;row<=5;row++)
		{
			int space;
			for( space=5;space>row;space--)
			{
				System.out.print("_");
				
			}
			int col;
			for( col=1;col<=row;col++)
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
				for(int col=5;col>=row;col--)
				{
					System.out.print("*");
					
				}
				System.out.println(" ");
			}
		}
	
}
