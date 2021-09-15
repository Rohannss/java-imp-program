package interview_Programs;

public class A7_Fibonacci_Series_While {

	public static void main (String []args) {
		
		//Fibonacci Series is series of number where next number is sum of previous two number.
        //0+1 =1   //1+1=2   //2+1=3   //2+3=5  //3+5=8
		  
		int x=0;
		int y=1;
		int z=0;
		int n =100;
		while(z<=n) {
			System.out.println(z);
			x = y;
			y = z;
			z = x + y;
			
		}
	}
}
