package basics;

public class SalayCalculator {
	public static void main(String[] args) {
	// let's cret a variabble to define our career
    // declare variable
		
		String career;
		System.out.println("Progress is starting");
	// define a variable
		career = "Software Developer";
	    System.out.println("My career is: " + career);
	 
	// declare & define
	    int hoursPerWeek = 40;
	    int weeksPerYear = 50;
	    double rate = 42.50;
	    double salary = hoursPerWeek * weeksPerYear * rate;
	    System.out.println("My salary as a " + career + " at the rate of $ " + rate + " per hour is $ " + salary + " per year.");
	 // compute out annual salary
	 // hoursPerWeek * weeksPerYear * rate
	}
	
}
