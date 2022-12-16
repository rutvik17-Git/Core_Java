package Assignments;

import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
	
		char h,l,g;
		int a;
		
		Scanner sc=new Scanner(System.in);
	 	
	    System.out.println("Enter the health condition is Excellent or Poor");
	    h=sc.next().charAt(0);
	    
	    System.out.println("Enter person lives in City or Village");
	    l=sc.next().charAt(0);
	    
	    System.out.println("Enter person Gender Male or Female");
	    g=sc.next().charAt(0);
	    
	    System.out.println("Enter person age");
	    a=sc.nextInt();
	    
	    if((h=='e') && (l=='c') && (g=='m') && (a>=25 || a<=35))
	    	System.out.println("The premium is Rs.4 per thousand  and his policy cannot be exceed Rs. 2 Lakh");

	    else if((h=='e') && (l=='c') && (g=='f') && (a>=25 || a<=35))
	    	System.out.println("The premium is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh.");
	    
	    else if((h=='p') && (l=='v') && (g=='m') && (a>=25 || a<=35))
	    	System.out.println("The Premium is Rs.6 ");
        
	    else
	    	System.out.println("Not fulfill the criteria.Hence not insured.");

	}

}
