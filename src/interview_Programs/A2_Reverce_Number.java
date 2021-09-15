package interview_Programs;

public class A2_Reverce_Number {
//The reverse number is number which will start from the last index point

	public static void main (String [] argu) {
		
		int reverce = 0;
		int reminder = 0;
		int number = 8796;
		
		while(number>0) {
			reminder = number%10;
			reverce = reverce*10+reminder;
			number = number/10;
			
		}
		System.out.println(reverce);
	}
}

