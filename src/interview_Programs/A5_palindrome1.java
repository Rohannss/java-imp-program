package interview_Programs;

import java.util.ArrayList;

public class A5_palindrome1 {

	public static void main(String[] args) {
		// to check palindrome between 1 t0 200

		int rev = 0;
		int rem = 0;
		ArrayList palindrome = new ArrayList();
		for(int i =0;i<=200;i++) {
			int num = i;
		  while(num!=0) {
			  
			  rem = num%10;
			  rev = rev*10+rem;
			  num = num/10;
			  
		  }
		  System.out.println(rev);
		  if(i==rev) {
			  palindrome.add(i); 
		  }
           rev=0;		
		  
		}
		  System.out.println(palindrome);
	}

}
