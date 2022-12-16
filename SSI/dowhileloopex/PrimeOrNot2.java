package dowhileloopex;

import java.util.Scanner;

public class PrimeOrNot2 {

	public static void main(String[] args) {
		
		int num,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		num=sc.nextInt();
		i=2;
		
		 do{
		  if(num%i==0)
		   {
			  System.out.println(num+"is not a prime number");
			  break;
		   }
		  i++;
		 }while(i<num);
		  
		if(i==num)
		{
			System.out.println(num+"is a prime number");
		}
				
	}
  
}
