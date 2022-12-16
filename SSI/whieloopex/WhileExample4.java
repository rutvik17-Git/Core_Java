package whieloopex;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
		 
	
		while(i<n) {
			System.out.print(i+" ");
			i++;
		}
	

	}

}
