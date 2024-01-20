package Basic_Java_Practice;

public class FibonacciSeries {
	//for recursion method
	static int r1=0,r2=1,r3=0;
	static void printFibonacci(int countr) {
		if(countr >0) {
			r3=r1+r2;
			r1=r2;
			r2=r3;
			System.out.println(" "+r3);
			printFibonacci(countr-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibonacci series program without using recursion
		int n1=0, n2=1,n3=3,i,count=10;
		System.out.println(n1+n2); //printing 0 and 1
		
		for(i=2; i<count;++i) { //loop starts from 2 because 0 and 1 are already printed
			n3 = n1+n2;
			System.out.println(" "+ n3);
			n1=n2;
			n2=n3;
		}
		
		//Fibonacci Series Using recursion 
		int countr = 10;
		System.out.println(r1+" "+r2); //printing 0 and 1
		printFibonacci(countr-2); //n-2 because 2 numbers are already printed
	}

}
