package methodAssgn;

import java.util.Scanner;

public class AreaOfTrapezium {

	static void findTrapezium() {
		

		double area,peri,l,b,h,c,d;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length and breadth and height and c and d of the Trapezium ");
		
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		
		area=h/2*(l+b);
		peri=l+b+c+d;
		
		System.out.println("Area of Trapezium  = "+area);
		System.out.println("Perimeter of Trapezium  = "+peri);
	}
	
	
	public static void main(String[] args) {
 
		findTrapezium();
	}

}