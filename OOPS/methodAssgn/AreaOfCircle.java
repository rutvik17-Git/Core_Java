package methodAssgn;

import java.util.Scanner;

public class AreaOfCircle {
	
	static void findArea() { 
         
		double area,circ,r;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the radius of the Circle");
		
		r=sc.nextDouble();
		
		area=3.1412*r*r;
		circ=2*3.1412*r;
		
		System.out.println("Area of circle = "+area);
		System.out.println("Circumfrence of circle = "+circ);
		
	}

	public static void main(String[] args) {
 
		findArea();
	}

}
