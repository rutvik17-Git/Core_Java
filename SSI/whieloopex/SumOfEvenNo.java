package whieloopex;

import java.util.Scanner;

public class SumOfEvenNo {
	public static void main(String[] args) {
		
		int i,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range : -");
		
		n=sc.nextInt();
		
		i=1;
		while(i<=n) {
			if(i==n)
				System.out.println(2*i);
			else
				System.out.print(2*i+" + ");
			i++;
	 }
	}
}
