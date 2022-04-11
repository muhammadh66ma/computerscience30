 package Account;
import java.text.NumberFormat;

public class Account {
	private double balance;
	private Customer cust;
		
	
    // Giving all the strings 
	public Account(double bal, String fName, String lName, String str, String city, String st, String zip) {
		balance = bal;
		cust = new Customer(fName, lName, str, city, st, zip);
	}
	

       //Set balance, get balance
	public double getBalance() {
	 	return(balance);
	}


     //set deposit,get deposit
	public void deposit(double amt) {
	 	balance += amt;
	}

	
       //Withdraw and if not enough balance show "Not enough money in account"
	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}

	
	//Return Strings
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}
}
