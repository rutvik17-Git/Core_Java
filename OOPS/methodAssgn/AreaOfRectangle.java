package methodAssgn;

import java.util.Scanner;

public class AreaOfRectangle {
	
	static void findRectangle() {
		
       double area,peri,len,width;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length and witdh of Rectangle");
		
		len=sc.nextDouble();
		width=sc.nextDouble();
		
		area=len*width;
		peri=2*(len*width);
		
		System.out.println("Area of Rectangle = "+area);
		System.out.println("Perimeter of Rectangle = "+peri);
		
	}

	public static void main(String[] args) {
 
		findRectangle();
	}

}
