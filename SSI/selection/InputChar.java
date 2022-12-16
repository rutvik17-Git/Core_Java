package selection;

import java.util.Scanner;

public class InputChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter character");
       
       c=sc.next().charAt(0);
       
       System.out.println("you have entered "+c);
	}

}
