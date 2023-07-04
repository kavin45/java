package collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class remove_duplicate {

	public static void main(String[] args) {
		remove_duplicate obj = new remove_duplicate();
		obj.remv();
		obj.another_list();

	}

	public void remv() {
		List<Integer> l = new LinkedList<Integer>();
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(7);
		l.add(7);
		l.add(8);
		l.add(7);
		l.add(3);
		System.out.println("After add  :" + l);
		Set<Integer> s = new LinkedHashSet<Integer>(l);

		/*
		 * for(int i=0;i<l.size();i++) { for( int j=i+1;j<l.size();j++) { if(l.get(i) ==
		 * l.get(j)) { l.remove(j); } } }
		 */

		System.out.println("after remove duplicate : " + s);
	}

	private void another_list() {
		List<Integer> l = new LinkedList<Integer>();
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(7);
		l.add(7);
		l.add(8);
		l.add(7);
		l.add(3);
		System.out.println("After add  :" + l);
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		Set<Integer> s1=new LinkedHashSet<Integer>();
		for(Integer i:l)
		{
			if(s1.contains(i))
			{
				s.add(i);
			}
			else
				s1.add(i);
		}	
		 System.out.println("duplicate elements  :" + s);
		 System.out.println("After remove duplicate  :" + s1);
		  
		 

	}
}
