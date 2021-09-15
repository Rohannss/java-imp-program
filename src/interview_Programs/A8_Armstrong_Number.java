package interview_Programs;

public class A8_Armstrong_Number {

	public static void main(String []args) {
		
		// Armstrong number is a number that is equal to the sum of cubes of its digit
		// eg.  153 = 1^3 + 5^3 +3^3 = 1 + 125 + 27
		
		int num = 153;
		int temp = num;
		int sum = 0;
		int rem = 0;
		while(num>0) {
			
			rem = num%10;
			num = num/10;
			sum = sum+(rem*rem*rem);
			
		}
		if(temp==sum) {
			System.out.println("Given number is armstrong number");
		}
		else {
			System.out.println("Given number is not armstrong number");
		}
	}
}
