package methodAssgn;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	
	static void EqulateralTriangle() {

		double area,peri,l,h;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the side and hypotenuse  of the EquilateralTriangle ");
		
		
		l=sc.nextDouble();
		h=sc.nextDouble();
		
		area=(l*h)/2;
		peri=3*l;
		
		System.out.println("Area of EquilateralTriangle  = "+area);
		System.out.println("Perimeter of EquilateralTriangle  = "+peri);
	}

	public static void main(String[] args) {
   
		EqulateralTriangle();
		
	}

}
