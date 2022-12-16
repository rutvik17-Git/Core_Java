package Assignments;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int n1,n2,n3,largest;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any 3 numbers");
         n1=sc.nextInt();
         n2=sc.nextInt();
         n3=sc.nextInt();
		
		largest=((n1>n2)?(n1>n3 ? n1: n3):(n2>n3 ? n2:n3 ));
				
	   
		System.out.println(largest+" is a largest number");

	}

}
