package labs;

public class Lab2 {

	public static void main(String[] args) {
		// create a student
		Student stu1 = new Student("Charbel", "768446158");
		
		stu1.enroll("math101");
		stu1.enroll("phys105");
		stu1.enroll("java102");
		
		//stu1.checkBalance();
		//stu1.showCourses();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}
}
	class Student {
	// properties	
	private String name;
	private String SSN;
	private String email;
	private static int ID = 0;
	private String userID;
	private String courses = "";
	private static final int costOfCourse = 500; // this price is for the university
	private int balance = 0;
	private String phone;
	private String city;
	private String state;
			
	
	
  
	
    public Student(String name, String SSN){
    	ID++;
    	this.name = name;
    	this.SSN = SSN;
    	setEmail();
    	setUserID();
}
    
    private void setEmail() {
    	email = name.toLowerCase() + "." + ID + "@mail.uni.com";
    	System.out.println("Your Email is: " + email);
   }
    
    public String getEmail() {
    	return email;
    }
    
    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setUserID() {
    	int max = 9000;
    	int min = 1000;
    	int randNum = (int)(Math.random() *(max - min));
    	randNum = randNum + min; 
    	userID = ID + "" + randNum + SSN.substring(5);
    	System.out.println("User ID: " + userID);
    	
    }
    public void enroll(String course) {
    	this.courses = this.courses + "\n" + course;
    	
    	balance = balance + costOfCourse;
    	
    }
    public void payTuition(int amount) {
    
    	System.out.println("Payment: " + amount);
    	balance = balance - amount;
    }
    public void checkBalance() {
    	System.out.println("Balance: $ " + balance);
    	
    }
    public void showCourses() {
    	System.out.println(courses);
    	
    }
    public String toString() {
    	return "[NAME: " + name +"]\n[COURSES: " + courses + "]\n[BALANCE: $ " + balance +"]";
    }
    
 }


