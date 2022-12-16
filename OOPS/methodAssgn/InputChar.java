package methodAssgn;

import java.util.Scanner;

public class InputChar {
	
	static void findInputChar(){
		
		char c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter character");
       
       c=sc.next().charAt(0);
       
       System.out.println("you have entered "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated methodAssgn stub
		
		findInputChar();
	}

}
