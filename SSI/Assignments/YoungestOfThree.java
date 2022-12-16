package Assignments;

import java.util.Scanner;

public class YoungestOfThree {

	public static void main(String[] args) {
		
	 int r,s,a;
	 
	 Scanner in=new Scanner(System.in);
	 
	 System.out.println("Enter the age of Ram ,Shyam and Ajay");
	 
	 r=in.nextInt();
	 s=in.nextInt();
	 a=in.nextInt();
	 
	 if(r<s)
	 {
		 if(r<a)
		   System.out.println(r+" is youngest if three");
		 else 
			 System.out.println(s+"is youngest if three");
	 }
	 else
	 {
		 if(s<a)
		 {
			 System.out.println(s+" is the youngest of three");
		 }
		 else
		 {
		      System.out.println(a+" is the youngest of three");

		 }
		 
	 }
	 
	}

}
