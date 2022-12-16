package forloopex;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int i,n,f=1;
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
	  
	    n=sc.nextInt();
	   
	   for(i=n;i>=1;i--)
	   {
		   f=f*i;
	
	   }
	  
	   System.out.println("Factorial  of "+n+" = "+f);
	  
    }
}
