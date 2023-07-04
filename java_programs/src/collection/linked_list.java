package collection;

import java.util.LinkedList;

public class linked_list {

	public static void main(String[] args) {
		 LinkedList<String> l=new LinkedList();  
         
         l.add("Kavi");  
         l.add("Vijay");  
         l.add("Ajay");  
         System.out.println(l);  
         //Adding an element at the specific position  
         l.add(1, "Mani");  
         System.out.println("After add  :"+l);  
         LinkedList<String> l2=new LinkedList();  
         l2.add("Ram");  
         l2.add("Hari");  
         //Adding second list elements to the first list  
         l.addAll(l2);  
         System.out.println("After addAll method: "+l);  
           
         //Adding an element at the first position  
         l.addFirst("Loki");  
         System.out.println("After  addFirst method: "+l);  
         //Adding an element at the last position  
         l.addLast("Mathan");  
         System.out.println("After addLast method: "+l); 
         //Removing specific element from arraylist  
         l.remove("Vijay");  
         System.out.println("After remove method: "+l); 
         //Removing first element from the list  
         l.removeFirst();  
         System.out.println("After removeFirst() method: "+l);  
     //Removing first element from the list  
         l.removeLast();  
         System.out.println("After removeLast() method: "+l); 
         //Removing all the elements available in the list       
         l.clear();  
         System.out.println("After  clear() method: "+l);   
           
}  

	}


