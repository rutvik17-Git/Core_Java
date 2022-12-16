package forloopex;

import java.util.Scanner;

public class SumOFSqaureOfNo {
	
	public static void main(String[] args) {
		
		int n,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any range : -");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
			if(i==n)
				System.out.println(i*i);
			else
				System.out.print(i*i+" + ");
	}

}
