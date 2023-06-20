package _2d_array;

public class matrix_5 {
	public static void main(String args[])
	{
		matrix_5 obj=new matrix_5();
		obj.matrix();
	}
	public void matrix()
	{
		int a[][]=new int[5][5];
		int n=1;
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				a[row][col]=n;
				n++;
			}
		}
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+" ");
				
			}
			System.out.println();
		}
	}

}
