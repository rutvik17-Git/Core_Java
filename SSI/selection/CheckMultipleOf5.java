package selection;

import java.util.Scanner;

public class CheckMultipleOf5 {

	public static void main(String[] args) {
		
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

	}


