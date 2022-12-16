package Assignments;

import java.util.Scanner;

public class CheckLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		
		/*
		 * 
		 * String result= (ch>=97 && ch<=122 ) ?ch + " is lower case" :ch +
		 * " is not lower case" ; System.out.println(result);
		 */
		if(ch>=97 && ch<=122)
			System.out.println(ch+" is lower case");
		else
			System.out.println(ch+" is not a lower case");
	
	}

}
