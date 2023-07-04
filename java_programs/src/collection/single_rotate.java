package collection;

import java.util.LinkedList;
import java.util.List;

public class single_rotate {
	public static void main(String[] args) {
		
	
	single_rotate obj=new single_rotate();
	obj.rotate();
	
	}
	public void rotate()
	{
		List<Integer> l=new LinkedList<Integer>();
		 l.add(1);
		 l.add(2);
		 l.add(3);
		 l.add(4);
		 l.add(5);	
		 System.out.println("After add  :"+l);  	
		 for(int i=0;i<l.size()-1;i++)
		 {
			 for(int j=i+1;j<l.size();)
			 {
			 int temp=l.get(i); 
			 int a = l.get(j);
			 l.set(i, a);
			 l.set(j, temp);
			 break;
		 }
		 }
		System.out.println("After roation : "+l);
	}

}
