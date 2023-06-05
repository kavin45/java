package Simple;

public class Find_marks {

	
	 public static void main(String args[])
	  {
	   Find_marks obj=new Find_marks();
	   obj.grade();
	   
	  }
	  public void grade()
	   {
	     int total_marks= -98;
	      //given marks is 90 to 100 then print A grade
	     if (total_marks>=90  &&  total_marks<=100)
	     {
	     System.out.println( total_marks +" = Given marks is A grade");
	     }
	      //given marks is 80 to 89 then print B grade
	     else if (total_marks>=80 && total_marks<90)
	     { 
	       System.out.println(total_marks +" = Given marks is B grade");
	     }
	       //given marks is 70 to 79 then print C grade
	     else if (total_marks>=70 && total_marks<80)
	     { 
	       System.out.println(total_marks + " = Given marks is C grade");
	     }
	      //given marks is 60 to 69 then print D grade
	     else if (total_marks>=60 && total_marks<70)
	     {
	      System.out.println(total_marks + " = Given marks is D grade");
	     }
	     //given marks is 50 to 59 then print E grade
	      else if (total_marks>=50 && total_marks<60)
	     {
	      System.out.println(total_marks + " = Given marks is E grade");
	     }
	      //given marks is 0 to 49 then print fail
	     else if (total_marks>=0&& total_marks<50)
	     {
	      System.out.println( total_marks +" = Fail ");
	     }
	        //given  marks is above 100 or below 0 then print the statement
	     else  
	     {
	       System.out.println(total_marks +" = Please check your Marks");
	     }
	  }
	
}
