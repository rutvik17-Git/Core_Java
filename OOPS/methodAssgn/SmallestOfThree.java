package methodAssgn;

import java.util.Scanner;

public class SmallestOfThree {
	
	static void smallestOf3() {
int a,b,c;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter any 3 numbers");
		
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		if(a<b)
		{
			if(a<c)
			{
			  System.out.println(a+" is the smallest number");
			}
			else
			{
			  System.out.println(c+" is the smallest number");
			}
		}
		else
		{
			if(b<c)
			{
				System.out.println(b+" is the smallest number");
			}
			else
			{
				System.out.println(c+" is the smallest number");
			}
			
		}
	}

	
		
	

	public static void main(String[] args) {
		smallestOf3();
	}
		
}
