package labs;

public class BankAccountApp2 {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("125489654", 1000.50);
		BankAccount acc2 = new BankAccount("126845684", 2000);
		BankAccount acc3 = new BankAccount("126843842", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.ToString());
	}

}

 class BankAccount implements IInterest{
	// properties of bank account
	// private for encapsulation
	// static means it belongs to the class not a particular person
	private static int ID = 1000; // internal ID
	private String accountNumber; // ID + random 2 digit num + first 2 num of SSN
	private static final String routingNumber = "11045646"; // final to make it a constant
	private String name;
	private String SSN;
	private double balance;
	
	// constructors
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
				
	}


	private void setAccountNumber() {
		int random =(int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);		
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}


	@Override
	public void accrue() {

		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String ToString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}

	
}
