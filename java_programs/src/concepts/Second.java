package concepts;

public class Second extends First{
	
	  void print() { System.out.println("Bye"); }
	  
	
	
	public static void main(String[] args) {
		First s=new Second();
		    s.print();
		   // System.out.println(s.getpi());
		    //System.out.println(First.pi);
		    
		    
	}

}
