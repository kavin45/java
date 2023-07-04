package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class array_to_arraylist {

	public static void main(String[] args) {
		array_to_arraylist obj=new array_to_arraylist();
		obj.arr();
		obj.rev();
	}
	public void arr() {
		int a[]= {1,2,3,4,5};
		List<Integer> l=new ArrayList();
		for(int i:a)
		{
			l.add(i);
		}
		System.out.println("after change list: "+l);
		
		String s[]= {"hari","jhon","peter","mike","hari"};
		  //Method 1
	      List list = Arrays.asList(s);   
	      System.out.println("After changing list : "+list);
	      Set<String> z=new LinkedHashSet<String>(list);
	      System.out.println("after duplicate remove : "+z);
	      //Method 2
	      List<String> list1 = new ArrayList<String>();
	      Collections.addAll(list1, s);
	      list1.add("mano");
	      System.out.println("After changing list : "+list1);		
	}
	public void rev() {
		  String r[]= {"RED", "BLUE", "BLACK"};
		  List l=Arrays.asList(r); 
	        Collections.reverse(l);
	        System.out.println("After string reverse : "+l);    
	}
}
