package forloopex;

import java.util.Scanner;

public class SumOfOddNo {
	public static void main(String[] args) {
		
		int i,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any range :-");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
			if(i==n)
			  System.out.println(2*i-1);
			else
				System.out.print(2*i-1+" + ");
		
	}

}
