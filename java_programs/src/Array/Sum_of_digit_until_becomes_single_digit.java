package Array;

public class Sum_of_digit_until_becomes_single_digit {

	public static void main(String args[]) 
	{
		Sum_of_digit_until_becomes_single_digit obj=new Sum_of_digit_until_becomes_single_digit();
		Static.size();
		Static.element();
		Static.display();
		obj.single_digit();
	}
	public void single_digit()
	{
		int b[]=Static.a;
		int single[]=new int[b.length];
		for(int i=0;i<b.length;i++)
		{
			int sum=0;
			for(int j=0;j<b[i];)
			{
			int mod=b[i]%10;
			sum=sum+mod;
			b[i]=b[i]/10;
			if(sum>9 &&b[i]==0 )
			{
				b[i]=sum;
				sum=0;
			}
			}
		single[i]=sum;
		}
		System.out.println();
		System.out.println("output array ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" "+single[i]);
		}
	}
}
