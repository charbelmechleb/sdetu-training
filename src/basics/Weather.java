package basics;

public class Weather {

	public static void main(String[] args) {
		
	// this progress will give suggestions on what to wear based on the weather (temperature)
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature >80) {
			System.out.println("It's pleasent, wear shorts and t_shirt");
		}
		else if (temperature >60  && sunCondition == "Sunny") {
				System.out.println("It's a littler cooler, perharps wear a long-sleeve shirt and jeans");
				System.out.println("Wear a hat to keep the sun out of your eyes");
			}
		else if ((temperature > 50) || (sunCondition == "Overcast")){
			System.out.println("This is a cool day, make sure to wear warmer clothes");
		}
		
			
		else {
			System.out.println("Looks like a cold day, bring a sweater");
		}
		System.out.println("The progress is ending");
		}
		
	}

