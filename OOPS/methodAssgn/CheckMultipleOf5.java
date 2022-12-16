package methodAssgn;

import java.util.Scanner;

public class CheckMultipleOf5 {
	
	static void multipleOf3()
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : -");
		
		num = sc.nextInt();
		
		if(num%3==0)
		{
			System.out.println(num +"is multiple of 3");
		}
		else
		{
			System.out.println(num +"is not a multiple of 3");
		}

	}

	public static void main(String[] args) {
		
		multipleOf3();

		}

	}


