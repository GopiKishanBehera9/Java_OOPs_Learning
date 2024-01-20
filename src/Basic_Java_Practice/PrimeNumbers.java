package Basic_Java_Practice;

import java.util.Scanner;

public class PrimeNumbers {

	static void checkPrime(int n) {
		int i,m=0,flag=0;      
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}//end of else  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, m= 0, flag= 0;
		int n=3; //it is the number to be checked

		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+"is not prime number");
		}else {
			for(i=2; i<=m; i++) {
				if(n%i==0) {
					System.out.println(n+"is not prime number");
					flag= 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is prime number");
			} //end of else
		}

		//prime number using Method
		System.out.println("--prime number using Method--");
		checkPrime(1);
		checkPrime(3);
		checkPrime(17);
		checkPrime(20);


		//Find Prime numbers between two numbers
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter the first number : ");  
		int start = s.nextInt();  
		System.out.print("Enter the second number : ");  
		int end = s.nextInt();  
		System.out.println("List of prime numbers between " + start + " and " + end);  
		for (int a = start; a <= end; a++) {  
			if (isPrime(a)) {  
				System.out.println(a);  
			}  
		}  
	}  
	public static boolean isPrime(int n) {  
		if (n <= 1) {  
			return false;  
		}  
		for (int a = 2; a <= Math.sqrt(n); a++) {  
			if (n % a == 0) {  
				return false;  
			}  
		}  
		return true;

	}

}
