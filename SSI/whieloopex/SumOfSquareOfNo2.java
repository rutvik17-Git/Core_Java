package whieloopex;

import java.util.Scanner;

public class SumOfSquareOfNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range :-");
		
		n=sc.nextInt();
		i=1;
		
		while(i<=n)
		{
			int c=i*i;
			
			if(i==n)
				System.out.println(c);
			else 
				System.out.print(c+" + ");
			i++;
			
			sum=sum+c;
		}
		
         System.out.println("\nSum of square numbers ="+sum);
	}

}
