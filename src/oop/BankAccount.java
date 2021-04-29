package oop;

// implementing the interface
public class BankAccount implements IRate{
	
	String accountNumber;
	// static means that this value is for the class, not the particular object
	// final makes it a constant(cannot be changed)
	// often we see static final together
	static final String routingNumber = "19654";
	// instance varriables
	private String name;// encapsulation
	private String ssn; // encapsulation
	String accountType;
	// declared outside the method, available for all tha class
	double balance = 0;
	
	// constructor definition: unique methods
	    // 1. they are used to define, setup, initialize a property of an object
	    // 2. constructors are IMPLICITELY called upon instantiation
	    // 3. the same name as the class itself
	    // 4. constructors have no return type at all
	BankAccount(){
		
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	
	// overloading: calling the same method with different arguments
	BankAccount(String accountType){
		
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $: " + initDeposit);
		String Msg = "";
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least 1000$";
		}
		else {
			Msg = "Thanks for initial deposit of $ " + initDeposit ;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	
	// getters and setters
	// allow the user to define the name(setter)
	public void setName(String name){
		this.name = name;
	//we can add a title (MR> for example)
	// this.name = "MR. " + name;
	}
	//getter
	public String getName() {
		return name;
	}
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	

	// define methods
	// public make it available anywhere in the project
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
		
		
	}
	// private means only available in the class
	private void showActivity(String activity){
		System.out.println("YOUR RECENT TRANSACTION: " +  activity);
		System.out.println("YOUR NEW BALANCE IS: $ " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
		
		
	}
	
	public String toString() {
		return "[Name: " + name + ", ACCOUNT #: " + accountNumber +" ROUTING #: " + routingNumber + ", Balance: $" + balance + "]";
		
	}


}
