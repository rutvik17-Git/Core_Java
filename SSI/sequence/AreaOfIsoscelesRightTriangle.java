package sequence;

import java.util.Scanner;

public class AreaOfIsoscelesRightTriangle {

	public static void main(String[] args) {
 
		double area,peri,l,h;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the side and hypotenuse  of the IsoscelesRightTriangle");
		
		
		l=sc.nextDouble();
		h=sc.nextDouble();
		
		area=(l*l)/2;
		peri=(2*l)+h;
		
		System.out.println("Area of IsoscelesRightTriangle = "+area);
		System.out.println("Perimeter of IsoscelesRightTriangle = "+peri);
	}

}
