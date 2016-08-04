package atmManagement;

public class Account {
	private long accNo = 62250028;
    private String pass = "123456";
	private long balance = 10000;
	
	public Account() { }
		 public boolean isValid(long accNo, String pass) {
		 return (this.accNo == accNo) && (pass.equals(this.pass));
		 }
		 
		 public void changePassword(String oldPass, String password) {
			 if (!oldPass.equals(this.pass)) {
				 System.out.println("Wrong password.");
		         return;
		         }
			 if (password.length() < 6) {
				 System.out.println("Password too short");
		     return;
		     }
			 if (password.equals(this.pass)) {
				 System.out.println("Password cannot be the same.");
		         return;
		         }
			 this.pass = password;
			 }
		 
		 public long balanceInquery() {
			 return this.balance; 
			 }
		 
		 public void withdraw(long amount) {
			 if (amount > 5000 || amount < 0) {
				 System.out.println("Withdraw limit: $0-$5000");
		         return;
		         }
			 if ((amount % 100) != 0) {
		         System.out.println("The amount has to be a product of 100");
		         return; 
		         }
			 long newBalance = this.balance - amount;
			 if (newBalance < 0) {
		         System.out.println("Not enough money in the account");
		         return; 
		         }
			 this.balance = newBalance;
			 }
		 
		 public void deposit(long amount) {
		  if (amount < 0) {
			  System.out.println("Cannot deposit negative amount");
		      return; 
		      }
		  this.balance += amount;   
		  }
		 
		 public String toString() {
		  return ("Account #: " + this.accNo + "\n" + "Password: " + this.pass + "\n" + "Balance: " + this.balance);
		  }
}