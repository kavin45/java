package Simple;

public class Hotel_menu {
	
	    public static void main(String args[])
	     { 
	      Hotel_menu obj=new Hotel_menu();
	       int food1=obj.veg();
	       int food2=obj.non_veg();
	       int totals=obj.total(food1,food2); 
	       obj.discount(totals);
	       }
	        public int veg()
	       {
	        int idli=30;
	        int dosa=50;
	        int meals=120;
	        int veg_total=idli+dosa+meals;
	        System.out.println("idli = "+idli);
	        System.out.println("dosa = "+dosa);
	        System.out.println("meals = "+meals);
	        System.out.println("veg total = " +veg_total);
	        return veg_total;
	        }
	        public int non_veg()
	        {
	         int chicken_biriyani=180;
	         int chilli_chicken=80;
	         int chicken_tandori=600;
	         int non_veg_total=chicken_biriyani+chilli_chicken+chicken_tandori;
	         System.out.println("chicken briyani = "+chicken_biriyani);
	         System.out.println("chilli chicken = "+chilli_chicken);
	         System.out.println("chicken tandori = "+chicken_tandori);
	         System.out.println("non veg total = " + non_veg_total);
	         return non_veg_total;  
	         }
	         public int total(int veg_total,int non_veg_total)
	         {
	          int total_food_amount=veg_total+non_veg_total;
	          System.out.println("Total food amount = "+total_food_amount);
	          return total_food_amount;
	          }
	          public void discount(int amount)         
	          {
	           int final_amount=amount-50;
	           System.out.println("Final amount = "+final_amount);
	          }           
	}

