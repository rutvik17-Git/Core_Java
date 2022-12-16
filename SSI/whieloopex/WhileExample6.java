package whieloopex;

import java.util.Scanner;

public class WhileExample6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
		i=1;
		
	     while(i<=n)
		{
			System.out.print(2*i+" ");
			i++;
		}
		
	}

}
