package whieloopex;

import java.util.Scanner;

public class WhileExample7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
      
		i=1;
		while(i<=n)
		 {
			if(i==n)
			{
			 System.out.println(i);
		 
		    }
		    
			else
			{ 	
			System.out.print(i+" + ");
			
            }
			i++;
		 }
	}
}
