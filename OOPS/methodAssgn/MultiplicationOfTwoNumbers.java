package methodAssgn;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
	
	static void multiplyTwo() {

		int multiplication,n1,n2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two numbers");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		multiplication=n1*n2;
		
		System.out.println("multiplication = " +multiplication);
		
	}

	public static void main(String[] args){
		
		multiplyTwo();
	}
	
}
