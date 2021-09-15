package interview_Programs;

import java.util.Scanner;

public class A4_Palindrome_number {
     //The Palindrome number is number which is same as reverse of it.
     //Examples:
    //78687 ==78678
    // for taking number
	public static void main(String[] args) {
		int rev =0;
		int rem = 0;
		int number = 12321;
        int temp = number;
		while(number!=0) {
			
			rem = number%10;
			rev = rev*10+rem;
			number = number/10;
		
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("Given number is pallindrome");
		}
		else{
			System.out.println("Given number is not pallindrome");
		}
		
		
		
		// by taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter number");
		int num = sc.nextInt();
		int rev1 =0;
		int rem1 = 0;
		int temp1 = num;
		while(num!=0) {
					
					rem1 = num%10;
					rev1 = rev1*10+rem1;
					num = num/10;
				
				}
				System.out.println(rev);
				if(rev1==temp1) {
					System.out.println("Given number is pallindrome");
				}
				else{
					System.out.println("Given number is not pallindrome");
				}
				sc.close();
	}
	
}
