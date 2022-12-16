package dowhileloopex;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		int i,n,fact=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		n=sc.nextInt();
		
		 i=1;
		
		do
		{
		  fact=fact*i;
		  i++;
		}while(i<=n);
		
		System.out.println("Factorial of "+n+"="+fact);
	}
	

}


