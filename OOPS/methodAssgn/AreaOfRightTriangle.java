package methodAssgn;

import java.util.Scanner;

public class AreaOfRightTriangle {

	  static void findRightTriangle() {
		  
			double area,peri,b,p,h;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the base ,perpendicular and hypotenuse  of the RightTriangle");
			
			b=sc.nextDouble();
			p=sc.nextDouble();
			h=sc.nextDouble();
			
			area=(b*p)/2;
			peri=b+h+p;
			
			System.out.println("Area of RightTriangle = "+area);
			System.out.println("Perimeter of RightTriangle = "+peri);
	  }
	
	public static void main(String[] args) {
 
		findRightTriangle();
	}

}
