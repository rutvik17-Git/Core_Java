package Assignments;

import java.util.Scanner;

public class RectangleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double l,b,peri,area;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Length and Breadth of rectangle");
		
		l=in.nextDouble();
		b=in.nextDouble();
		
		area=l*b;
		peri=2*(l*b);
		
		System.out.println("Area of rectangle is "+area);
		System.out.println("Perimeter of rectangle is "+peri);
		
		if(area>peri)
			System.out.println("Area of Rectangle is greater than perimeter");
     
		else
			System.out.println("Perimeter of Rectangle is greater than area");

		
	}

}
