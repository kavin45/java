package Array;

public class Sum_of_two_array {
	public static void main(String args[])
	{
		Sum_of_two_array obj=new Sum_of_two_array();
		
		obj.sum();
	}
	public void sum()
	{
		int a[]= {1,2,3,4};
		int b[]= {2,4,6,8};
		int c[]=new int[a.length];
		System.out.println("Sum of the array is");
			
			for (int i=0; i < c.length; i++)
			{
				
				 c[i]=a[i]+b[i];
				 System.out.println(c[i]);

				
			}
						}
	}


