package interview_Programs;

public class A1_Factorial {

	public static void main (String []argu) {
		
		int number = 5;
		int factorial = 1;
		for(int i=number;i>0;i--) {
			
			factorial = factorial*i;
			
		}
		System.out.println("factorail of number 5 is "+ factorial);
	}
}

// The factorial function (symbol:!) says to multiply all whole numbers from our chosen number down to 1
// eg. 4! = 4*3*2*1
