package forloopex;

import java.util.Scanner;

public class ForExample7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
			if(i==n)
			 System.out.println(i);
			else
			System.out.print(i+" + ");

	}
	

}
