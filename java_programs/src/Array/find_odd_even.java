package Array;

public class find_odd_even {
	public static void main(String args[])
	{
		find_odd_even obj=new find_odd_even();
		Static.size();
		Static.element();
		Static.display();
		obj.find();
	}
	public void find()
	{
		int b[]=Static.a;
		int count1=0;
		int count2=0;
		for(int i=0;i<b.length;i++)
		{
			
			if(b[i]%2==0)
			{
				count1++;
				
			}
			else
			{
				count2++;
				
			}
		}
		int even[]=new int[count1];
		int odd[]=new int[count2];
		int temp1=0;
		int temp2=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				
				even[temp1]=b[i];
				temp1++;
			}
		}
			for(int i=0;i<b.length;i++)
			{
				if(b[i]%2!=0)
			{
				odd[temp2]=b[i];
				temp2++;	
			}
		}
		System.out.println();
		System.out.println("even numbers in array : ");
			for(int i=0;i<even.length;i++)
			{
				System.out.print(" "+even[i]);
				
			}
			System.out.println();
			System.out.println("odd numbers in array : ");
				for(int i=0;i<odd.length;i++)
				{		
					System.out.print(" "+odd[i]);
					}
				
}
}
