package exception;
public class bank_acc {
	   private int balance;
       public bank_acc(int balance) {
	        this.balance = balance;
	    }
	     public int getBalance(){
	        return balance;
	    }
         public void withdraw(int amount) throws NegativeBalanceException {
	    
	        if (balance - amount < 0) {
	            throw new NegativeBalanceException("Insufficient amounts to withdraw " + amount + " rupees.");
	        } else {
	            balance =balance- amount;
	            System.out.println("withdraw amount = "+amount);
	        }
	    }
	        public static void main(String[] args) {
	        bank_acc b = new bank_acc(500);

	        try {
	            b.withdraw(300);
	           
	        } catch (NegativeBalanceException e) {
	            System.err.println(e.getMessage());
	        }

	        System.out.println("Remaining balance: " + b.getBalance());
	    }
}
