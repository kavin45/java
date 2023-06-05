package Array;

public class double_rotation {

	public static void main(String args[])
	{
		double_rotation obj=new double_rotation();
		Static.size();
		Static.element();
		Static.display();
		obj.rotation();
	}
	public void rotation()
	{
		int temp=Static.a[0];
		int i;
		for( i=0;i<Static.a.length-1;i++)
		{
			Static.a[i]=Static.a[i+1];
		}
		Static.a[i]=temp;
		System.out.println();
		System.out.println("After one rotation: ");
		for( i=0;i<Static.a.length;i++)
		{
			System.out.println(Static.a[i]);
		}
		
		System.out.println();
		int temp1=Static.a[0];
		for( i=0;i<Static.a.length-1;i++)
		{
			Static.a[i]=Static.a[i+1];
		}
		Static.a[i]=temp1;
		System.out.println();
		System.out.println("After two rotation: ");
		for( i=0;i<Static.a.length;i++)
		{
			System.out.println(Static.a[i]);
		}
		
		
		
		
	}

}


