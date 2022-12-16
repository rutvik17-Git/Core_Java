package Assignments;

import java.util.Scanner;

public class CheckSpecialCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		
		
		
		if(ch>=0 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch>=96 || ch>=123 && ch<=127)
			System.out.println(ch+" is special syambol");
		else
			System.out.println(ch+" is not a special symbol");
				
		/*
		 * String result= (ch>=0 && ch<=47 || ch>=58 && ch <=64 || ch>=91 && ch<=96 ||
		 * ch>=123 && ch <=127) ?ch + " is Special Symbol" :ch +
		 * " is not Special Symbol" ; System.out.println(result);
		 */
	}

}
