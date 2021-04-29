package basics;

public class Cities {

	public static void main(String[] args) {
		// declare and define an array
		String[] cities ={"New york", "San Fransisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		//declare and define the array(only the size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println(states[0]);
		
		// declare array
		String[] countries;
		// define array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[0] = "UK";
		System.out.println(countries[0]);
		
		// each of these three arrays shows a different method for creating an array
		
		
        
	}

}
