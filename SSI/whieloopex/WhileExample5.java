package whieloopex;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
		
		 
		do
		{
		System.out.print(i+" ");
		i++;
		}while(i<=n);
	}

}
