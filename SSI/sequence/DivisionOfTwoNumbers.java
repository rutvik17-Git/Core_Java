package sequence;

import java.util.Scanner;

public class DivisionOfTwoNumbers {

	public static void main(String[] args){
		
		int Division,n1,n2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two numbers");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		Division=n1/n2;
		
		System.out.println("Division = " +Division);
		
		
	}
	
}
