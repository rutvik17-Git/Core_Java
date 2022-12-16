package dowhileloopex;

import java.util.Scanner;

public class SumOfSqaureOfNo2 {
	
	public static void main(String[] args)
	{
		int i,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any range :-");	
	    
	    n=sc.nextInt();
	    
	    i=1;
	    do {
	    	
	    	if(i==n)
	    	 System.out.println(i*i);
	    	else 
	    	 System.out.print(i*i+" + ");
	    	i++;
	    	
	    	sum=sum+i;
	    }while(i<=n);
	
	   System.out.println("Sum of  = "+sum) ;
}
}
