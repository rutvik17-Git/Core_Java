package Assignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any Year");
		year=sc.nextInt();
		
		if(year%400==0 && year%100==0 || year%4==0)
          System.out.println("It is Leap Year");		
		else
		  System.out.println("It is not Leap Year");
		
	}

}
