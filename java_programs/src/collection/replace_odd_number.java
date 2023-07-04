package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class replace_odd_number {
	public static void main(String[] args) {
		 replace_odd_number obj=new replace_odd_number();
		 obj.odd();
	     List<Integer> s=obj.next();
	     obj.previous(s);
		
	}
	public List<Integer> next() {
		List<Integer> l=new LinkedList<Integer>();
		 l.add(1);
		 l.add(5);
		 l.add(3);
		 l.add(4);
		 l.add(5);
		 l.add(1);
		 l.add(5);
		 l.add(3);
		 System.out.println("After add  :"+l);
		 for(int i=0;i<l.size();i++)
		 {
			 if(l.get(i)==5)
			 {
				 l.add(i+1, 999);
			 }
		 }
		 System.out.println("after number 5 :"+l);
		 return l;
		
	}
	public void previous(List s)
	{
		System.out.println("before change "+s);
		 ListIterator<Integer> itr=s.listIterator();

		 while(itr.hasNext())
		 {
			 itr.next();
		 }
		 while(itr.hasPrevious())
		 {
			 if(itr.previous()==5)
			 {
				 itr.add(888);
			 }
		 }
		 System.out.println("after change "+s);
			 
	}
	public void odd()
	{
		List<Integer> l=new LinkedList<Integer>();
		 l.add(1);
		 l.add(2);
		 l.add(3);
		 l.add(4);
		 l.add(5);	
		 System.out.println("After add  :"+l);
		 for(int i=0;i<l.size();i++)
		 {
			 if(l.get(i)%2!=0)
			 {
				 l.set(i, 99);
			 }
		 }
		 System.out.println(" after remove odd "+l);	 
	}

}
