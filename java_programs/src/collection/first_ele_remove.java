package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class first_ele_remove {
	public static void main(String[] args) {
		first_ele_remove obj=new first_ele_remove();
		obj.first();
		obj.second();
	
		
	}
 public void first()
 {
	 LinkedList<Integer> l=new LinkedList<Integer>();
	 l.add(1);
	 l.add(2);
	 l.add(3);
	 l.add(4);
	 l.add(5);
	 l.add(6);
	 l.add(7);
	 l.add(8);
	 System.out.println("After add  :"+l);  
	 ListIterator<Integer> itr=l.listIterator();
	 int count=0;
	 int sum=0;
	 while(itr.hasNext())
	 {
		 
		 sum=sum+(int)itr.next();
		 itr.remove();
		 count++; 
		 if(count==4)
		 {
			 break;
		 }
	 }
	 System.out.println("remove after : "+l);
	 System.out.println("sum = "+sum);
	 
 }
 public void second()
 {
	 LinkedList<Integer> l=new LinkedList<Integer>();
	 l.add(1);
	 l.add(2);
	 l.add(3);
	 l.add(4);
	 l.add(5);
	 l.add(6);
	 l.add(7);
	 l.add(8);
	 System.out.println("After add  :"+l);  
	 ListIterator<Integer> itr=l.listIterator();
	 int count=0;
	 while(itr.hasNext())
	 {
		 itr.next();
	 }
	 while(itr.hasPrevious())
	 {
		 itr.previous();
		 itr.remove();
		 count++;
	 
	 if(count==4)
	 {
		 break;
	 }
	 }
 System.out.println(l);
 }
}
