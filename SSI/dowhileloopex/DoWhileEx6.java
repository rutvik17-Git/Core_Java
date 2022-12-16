package dowhileloopex;

import java.util.Scanner;

public class DoWhileEx6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
		i=1;
		
	     do
		{
			System.out.print(2*i+" ");
			i++;
		}while(i<=n);
		
	}

}
