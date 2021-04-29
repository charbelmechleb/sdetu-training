package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
	    int numB = 20;
	    addNumbers(numA, numB);
	    int product = multipleNumbers(numA, numB);
	    System.out.println("the product of " + numA + " and " + numB + " is " + product);
	   // or we can use 
	   // System.out.println("the product of " + numA + " and " + numB + " is " + multipleNumbers(numA, numB));
	   // without defining int product, it will print the same result
	}
	
	static void printName() {
		System.out.println("My name is Charbel");
		
	}
	
	static void addNumbers(int numberA, int numberB){
		// this function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of " + numberA + " and " + numberB + " is " + sum);
				
	}
	

	static int multipleNumbers(int valueA, int valueB){
		int product = valueA * valueB;
		// calling a function inside another function
		addNumbers (product + 50, product);
		return product;
		
	}
   
}
