package Array;

public class single_rotation {
	public static void main(String args[])
	{
		int a[]= {4,5,3,1};
	    int temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
			a[i]=temp;
		
			}
			if(i<a.length-1)			{
				a[i]=a[i+1];
				
			}
		}
		System.out.println("After one rotation : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
		}
		
	
			}


