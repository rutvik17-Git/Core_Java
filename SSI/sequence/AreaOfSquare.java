package sequence;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
 
		double area,peri,r;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of the Square");
		
		r=sc.nextDouble();
		
		area=r*r;
		peri=4*r;
		
		System.out.println("Area of Sqaure = "+area);
		System.out.println("Perimeter of Square = "+peri);
	}

}
