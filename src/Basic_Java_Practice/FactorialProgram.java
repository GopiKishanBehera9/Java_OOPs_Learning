package Basic_Java_Practice;

public class FactorialProgram {

	static int factorial(int n) {
		if(n == 0) {
			return 1;
		}else {
			return( n* factorial(n-1));
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Factorial program using loop
		int i,fact=1;
		int number= 5; //its the number to calculate factorial
		for(i = 1; i<=number; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+number+" is:"+fact);
	
		
		//Factorial Using recursion
		int a,facto = 1;
		int numbers=4; //it is the number to calculate
		facto = factorial(numbers);
		System.out.println("Factorial of: "+numbers+" is:"+facto);
	
	
	
	
	}

}
