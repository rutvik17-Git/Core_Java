package Assignments;

import java.util.Scanner;

public class CheckLeapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long l;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any year");
		l=sc.nextLong();
		
		
				
	    String  result= (l%400==0 && l%100==0 || l%4==0 )
	    ?l + " is leap year"
	    :l + " is not leap year" ;
		System.out.println(result);

	}

}
