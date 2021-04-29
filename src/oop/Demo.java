package oop;

class person{
	
	String name;
	String email;
	String phone;
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// initiating an object
		person person1 = new person();
		
		// define some properties
		person1.name = "Joe";
		person1.email = "joe@test.com";
		person1.phone = "6164684264";
		
		// abstraction
		person1.walk();
		
		
		person person2 = new person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		/*
		// person
		
		// attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "Joe@test.com";
		String phone = "6164684264";
		
		// action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// what if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "Sarah@test.com";
		String phone2 = "6826843345";
		
		// action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// what about binding attributes and properties together?
		
		
	}
	// enhance by adding functions to minimize codes
	static void walking(String name) {
		System.out.println(name + " is walking");
		
		*/
	}
	

}
