package Array;

public class Second_max_min {
	
	public static void main(String args[])
	{
		find_middle_element_array.size();
		find_middle_element_array.element();
		find_middle_element_array.display();
		Second_max_min obj = new Second_max_min();
		               obj.Second_max();
		
	}
	
	public void Second_max()
	{
		int max = Integer.MIN_VALUE;
		int s_max = Integer.MIN_VALUE;
		
		for(int j=0;j<find_middle_element_array.a.length;j++)
		{
				if(max < find_middle_element_array.a[j])
				{
					s_max = max;
					max = find_middle_element_array.a[j];
				}
				
				if(s_max < find_middle_element_array.a[j] &&
						   find_middle_element_array.a[j] != max)
				{
					s_max = find_middle_element_array.a[j];
				}
			}
		
		
		System.out.println();
		System.out.println("First largest element " + max);
		System.out.println("Second largest element " + s_max);
		
		
		
	}

}
