package methodAssgn;

import java.util.Scanner;

public class SmallestOFTwo2 {

	public static void main(String[] args) {
		// TODO Auto-generated methodAssgn stub
    int n1,n2;
    
    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter any two numbers");
    
     n1=input.nextInt();
     n2=input.nextInt();
     
     if(n1<n2)
    	 System.out.println(n1+ "is the Smallest number");
    
     else
    	 System.out.println(n2+ "is the Smallest number");

	}

}
