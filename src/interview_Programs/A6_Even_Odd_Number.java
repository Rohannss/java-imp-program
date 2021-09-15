package interview_Programs;

import java.util.Scanner;

public class A6_Even_Odd_Number {

	public static void main(String[] args) {
	

		
		for(int i=0;i<25;i++ ) {
			if(i%2==0) {
				System.out.println("Even number is "+i);
			}
		}
		
		for(int i=0;i<25;i++ ) {
			if(i%2 !=0) {
				System.out.println("odd number is "+i);
			}
		}
		
		// to check given number is odd or even input by user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pls enter the number ");
		
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Given number is even number "+num);
		  }
		else {
			System.out.println("number is odd "+num);
		}
	}

}
