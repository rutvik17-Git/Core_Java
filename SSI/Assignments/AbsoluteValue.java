package Assignments;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		n=sc.nextInt();
		
		if(n<0)
		{
			n=(-1)*n;
		}

		System.out.println("Absolute value is " +n);
		
	}
}