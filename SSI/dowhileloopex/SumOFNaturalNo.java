package dowhileloopex;

import java.util.Scanner;

public class SumOFNaturalNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
		
		i=1;
		do{
			if(i==n)
			 System.out.println(i);
			else
			System.out.print(i+" + ");
		    i++;
	     }while(i<=n);

	}
}
