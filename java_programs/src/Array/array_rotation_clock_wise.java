package Array;

public class array_rotation_clock_wise {
	public static void main(String args[])
	{
		array_rotation_clock_wise obj=new array_rotation_clock_wise();
		Static.size();
		Static.element();
		Static.display();
		obj.rotation();
	}
	public void rotation()
	{
		int b[]=Static.a;
		int temp=b[b.length-1];
		int i;
		for( i=b.length-1;i>0;i--)
		{
		     b[i]=b[i-1];
		    			
	     }
		b[0]=temp;
		System.out.println();
		System.out.println("After one rotation: ");
		for(  i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
