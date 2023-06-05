package Array;

public class First_repeative_element_in_array {
	public static void main(String args[])
	{
		First_repeative_element_in_array obj=new First_repeative_element_in_array();
		Static.size();
		Static.element();
		Static.display();
		obj.first();
		obj.non_repeative();
		
	}
	public void first()
	{
		
		int b[]=Static.a;
		System.out.println();
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					flag=true;
				}
			}
		if(flag==true)
		{
			count++;
			System.out.println("First Repeative element is present here : "+b[i]);
			break;
		}
		}
		
		if(count==0)
		{
			System.out.println("Repeative element is not present here : ");
		}
		
	}
	public void non_repeative()
	{
		int b[]=Static.a;
		System.out.println();
		System.out.println("First non repeative element : ");
		for(int i=0;i<b.length;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					flag=true;
				}
			}
		
		if(flag==false)
		{
			System.out.println(b[i]);
			break;
		}
		}

	}
	

}
