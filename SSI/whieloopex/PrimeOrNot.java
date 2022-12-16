package whieloopex;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int num,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		num=sc.nextInt();
	   
		i=2;
		
		  if(num==0 || num==1)
			  System.out.println(num+"is not a prime number");

		while(i<num) {
		  if(num%i==0)
		  {
			  System.out.println(num+"is not a prime number");
			  break;
		  }
		  i++;
	    
		if(i==num)
		{
			System.out.println(num+"is a prime number");
		}
		
		}
	
	}
}
