package labs;

public class Lab1 {

	public static void main(String[] args) {
		
		System.out.println(sum(4));
		System.out.println("factorial : " + fact(5));
		int [] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Min is: " + findMin(numbers));
		System.out.println("Max is: " + findMax(numbers));
		System.out.println("Avg is: " + findAvg(numbers));
		
	}
	// Write a function that takes a value n returns the sum of numbers 1 to n
	public static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n ; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println( " = " + sum);
		}
		return sum;
		
	}
	// Write a function that computes the factorial value(Use recursion)
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return fact(n-1) * n;
		}
	}
	// Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array
	public static int findMin(int [] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				
			}	
		}
		return min;
	}
	
	public static int findMax(int [] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				
			}	
		}
		return max;
	}
	
	// calculate sum, and devide it by number of elements
	public static int findAvg(int [] arr) {
		int sum = 0;
	       for( int n = 0; n < arr.length; n++) {
	    	  sum = sum + arr[n];
			  
			}	
	       System.out.println("Sum is: " + sum);
	       return sum/arr.length;
	 }
		
	}

