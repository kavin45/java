package Simple;

public class Main {
	
	  int x = 5;
	 int y = 18;
	 
	  public static void main(String[] args) {
	    Main myObj1 = new Main();
	    Main myObj2 = new Main();
	    
	    System.out.println(myObj1.x);
	    myObj1.print();
	    
	    myObj2.x = 13;
	    myObj2.print();
	    
	  }
	  
	  public void print()
	  {
	  System.out.println(x+" "+y);
	     }
	}


