package forloopex;

import java.util.Scanner;

public class SumOfEvenNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range :-");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			int c=2*i;
			if(i==n)
				System.out.println(c);
			
			else
				System.out.print(c+" + ");

			sum=sum+c;
		}
		System.out.println("Sum of even numbers ="+sum);
	}

}
