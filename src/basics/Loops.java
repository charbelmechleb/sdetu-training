package basics;

public class Loops {

	public static void main(String[] args) {
		//
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i =0;
		// do loop enter the loop then tests condition
		do {
			System.out.println("STATE: " + states[i]);
			i++; // same as i = i + 1;
		} while (i < 5);
		
		System.out.println("\nPrinting with while loop");
		// while loop test condition first then enters the loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
			System.out.println("STATE FOUND");
			stateFound = true;
			}
			n++;
		}
		
		System.out.println("\nPrinting with for loop");
		// for loop, best structure for iterating through an array
		for (int x =0; x < 5 ; x++) {
			
			System.out.println(states[x]);
			
		}
		
		

	}

}
