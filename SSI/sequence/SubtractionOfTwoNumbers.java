package sequence;

import java.util.Scanner;

class SubtractionOfTwoNumbers{
	
	public static void main(String[] args) {
		
		int Subtraction,n1,n2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two numbers");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		Subtraction=n1-n2;
		
		System.out.println("Subtraction "+Subtraction);

	}
}
