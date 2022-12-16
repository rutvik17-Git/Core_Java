package Assignments;

import java.util.Scanner;

public class PointLies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x,y;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Points");
		
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		 if(x==0 && y==0)
		{
			System.out.println("Point lies at the origin ");
		}
		 else if(x==0)
		{
			System.out.println("Point lies on Y-axis ");
		}
		else if(y==0)
		{
			System.out.println("Point lies on X-axis ");
		}
		
		else 
		{
			System.out.println("Point neither lies on x-axis nor y-axis ");

		}
	}
	

}
