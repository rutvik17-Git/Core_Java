package dowhileloopex;

import java.util.Scanner;

public class SumOfNaturaNo2l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		
		n=sc.nextInt();
		
		i=1;
		do {
			int c=i;
			
			if(i==n)
			  System.out.println(c);
			else 
			  System.out.print(c+" + ");
			i++;
			
			sum=sum+c;
		}while(i<=n);
		
		System.out.println("Sum of natural numbers ="+sum);
	}

}
