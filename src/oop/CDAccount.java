package oop;

     //classes can have multiple implementations but only one extension
public class CDAccount extends BankAccount implements IRate {
	
	String interestRate;
	
	void compound() {
		System.out.println("Compounding Interest");
	}

}
