package Assignments;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		int ascii;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the character");
		
		ch=in.next().charAt(0);
		ascii=ch;
		
		if(ascii >=65 && ascii<=90)
			System.out.println("It is Upper Letter");
		else if(ascii >=97 && ascii <=122)
			System.out.println("It is Lower Letter");
		else if(ascii >=48 && ascii <=57)
			System.out.println("It is Digit");
		else if(ascii >=0 && ascii<=47 || ascii >=58 && ascii <=64 || ascii >=91 && ascii <=96 || ascii >=123 && ascii<=127)
			System.out.println("It is Speacial Character");
			
	}

}
