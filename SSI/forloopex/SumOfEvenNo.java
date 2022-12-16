package forloopex;

import java.util.Scanner;

public class SumOfEvenNo {
	public static void main(String[] args) {
		
		int i,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range : -");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
			if(i==n)
				System.out.println(2*i);
			else
				System.out.print(2*i+" + ");
	}

}
