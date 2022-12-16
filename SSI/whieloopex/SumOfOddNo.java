package whieloopex;

import java.util.Scanner;

public class SumOfOddNo {
	public static void main(String[] args) {
		
		int i,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any range :-");
		
		n=sc.nextInt();
		i=1;
		while(i<=n) {
			if(i==n)
			  System.out.println(2*i-1);
			else
				System.out.print(2*i-1+" + ");
		i++;
	  }
	}

}
