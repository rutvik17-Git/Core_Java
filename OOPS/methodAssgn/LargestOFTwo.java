package methodAssgn;

import java.util.Scanner;

public class LargestOFTwo {
	
	static void findLargestOfTwo() {
	    int n1,n2;
	    
	    Scanner input=new Scanner(System.in);
	    
	    System.out.println("Enter any two numbers");
	    
	     n1=input.nextInt();
	     n2=input.nextInt();
	     
	     if(n1>n2)
	    	 System.out.println(n1+ "is the largest number");
	    
	     if(n2>n1)
	    	 System.out.println(n2+ "is the largest number");

		}

	

	public static void main(String[] args) {
		// TODO Auto-generated methodAssgn stub
     
		findLargestOfTwo();
 }
}