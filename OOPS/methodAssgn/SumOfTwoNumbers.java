package methodAssgn;

import java.util.Scanner;

public class SumOfTwoNumbers {
	
	static void sumOfTwo() {
	
		int sum,n1,n2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two numbers");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		sum=n1+n2;
		
		System.out.println("Sum = " +sum);
	}

	public static void main(String[] args){
		
	  sumOfTwo();		
		
	}
	
}
