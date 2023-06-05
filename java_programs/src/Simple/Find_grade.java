package Simple;

public class Find_grade {
	
	  public static void main(String args[])
	   {
	   Find_grade obj=new Find_grade();
	   obj.marks('A');
	   obj.marks('B');
	   obj.marks('F');
	   obj.marks('X');
	   obj.marks('Z');
	   
	   
	   }
	   public void marks(char n)
	   {
	   switch(n)
	   {
	    case 'A': 
	          {
	           System.out.println("The given marks is 90 to 100: " +n );
	           break;
	           }
	    case 'B': 
	          {
	           System.out.println("The given marks is 80 to 89: " +n);
	           break;
	           }
	     case 'C': 
	          {
	           System.out.println("The given marks is 70 to 79: " +n);
	           break;
	           }
	      case 'D': 
	          {
	           System.out.println("The given marks is 60  to 69: " +n);
	           break;
	           }
	      case 'E': 
	          {
	           System.out.println("The given marks is 50to 59: " +n);
	           break;
	           }
	      case 'F':
	           {
	           System.out.println("The given marks is 0 to 49: " +n);
	           break;
	           }
	      case 'G':
	             {
	           System.out.println("The Person is absent: " +n);
	          break;
	           }

	       default : 
	          {
	           System.out.println("it is not a vaild grade: " +n);
	           
	           }
	     }
	  }
	













}
