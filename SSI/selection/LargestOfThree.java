package selection;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any three numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+ " is the largest number");
			}
			else
			{
				System.out.println(c+ " is the largest number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+ " is the largest number");
			}
			else
			{
				System.out.println(c+ " is the largest number");
			}
		}
		
	}

}
