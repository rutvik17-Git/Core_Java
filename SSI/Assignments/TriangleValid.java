package Assignments;

import java.util.Scanner;

public class TriangleValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int l,m,n,sum;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the anagles of the traingle");
		
		l=in.nextInt();
	    m=in.nextInt();
	    n=in.nextInt();
	    
	    sum=l+m+n;
	    
	    if(sum==180)
	    	System.out.println("Triangle is valid");
	    else
	    	System.out.println("Triangle is invalid");

	}

}
