package selection;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr any number");
		
		num=sc.nextInt();
		
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
		
	}

}
