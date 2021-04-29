package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account(instantiate an object)
		
		BankAccount acc1 = new BankAccount();
		// acc1.name = "Roger"; (we made name a private variable)
		
		// with encapsulation (we created a setter method called setName)
		// encapsulation is hiding the variable inside the class and accessing them publiclt through
		// methods( setters nad getters)
		acc1.setName("Roger");
		System.out.println(acc1.getName());
		acc1.setSsn("18621866");
		System.out.println("SSN: " + acc1.getSsn());
	
		
		acc1.balance = 10000;
		acc1.accountNumber = "1863216548";
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		// polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		// polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "1534534";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "1584634";
		/*
		acc3.checkBalance();
		
		
		// demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}


}
