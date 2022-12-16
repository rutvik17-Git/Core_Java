package methodAssgn;

import java.util.Scanner;

public class AreaOfTriangle {
	
	static void findTriangle(){
		
       double area,peri,l,b,h,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the l,b,h,c  of the Triangle");
		
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
		c=sc.nextDouble();
		
		area=(b*h)/2;
		peri=l+b+c;
		
		System.out.println("Area of Triangle = "+area);
		System.out.println("Perimeter of Triangle = "+peri);
		
	}

	public static void main(String[] args) {
 
		findTriangle();
	}

}
