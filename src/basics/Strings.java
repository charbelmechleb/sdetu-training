package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord Of The Rings";
		
		// .contains returns true or false
		if(bookTitle.contains (wordChoice)) {
			System.out.println("The book contains the word Ring");
		}
		
		String browser = "Chrome";
		// .equalsIgnoreCase check if string is equal to the given values regardless of the case
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("The browse is Chrome");
			
		}
		
		String firstName = "Charbel";
		String lastName = "Mechleb";
		String SSN = "154366545";
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		// print the initials plus last four letters of SSN
		// we removed the ln so they are printed on the same line
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(5));
		 
	}

}
