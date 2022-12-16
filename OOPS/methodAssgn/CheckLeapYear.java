package methodAssgn;

import java.util.Scanner;

public class CheckLeapYear {

	
	     static void checkLeap() {
		int year;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter any year : -");
		year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println(year +"is a leap year ");
		}
		else
		{
			System.out.println(year +"is not a leap year");
		}
	}

	     public static void main(String[] args) {
	 		
				checkLeap();


			}

	}
/*
public static void main(String[] args) {
	int year;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any year : - ");
	
	year=sc.nextInt();
	
	if(year%4==0)
		System.out.println(year+" is a leap year");
	
	else
		System.out.println(year+" is not a leap year");
}

*/

