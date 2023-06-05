package Array;

public class Bubble_sort {
public static void main(String args[])
{
	Bubble_sort obj=new Bubble_sort();
	Static.size();
	Static.element();
	Static.display();
	   obj.acending();
	   obj.decending();
}
public void acending()
{
	int b[]=Static.a;
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]>b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				
			}
		}
	}
	System.out.println("Sorting in Acesnding order : ");
     for(int i=0;i<b.length;i++)
     {
    	 System.out.print(" "+b[i]);
     }
}
public void decending()
{
	int b[]=Static.a;
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]<b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				
			}
		}
	}
	System.out.println();
	System.out.println("Sorting in decesnding order : ");
     for(int i=0;i<b.length;i++)
     {
    	 System.out.print(" "+b[i]);
     }
}
}
