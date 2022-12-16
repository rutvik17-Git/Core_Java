package methodAssgn;

import java.util.Scanner;

public class AreaOfRhombus {
	
	static void findRhombus() {
		
        double area,peri,r,d1,d2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius ,diameter1 and daimeter2 of the rhombus");
		
		r=sc.nextDouble();
		d1=sc.nextDouble();
		d2=sc.nextDouble();
		
		area=(d1*d2)/2;
		peri=4*r;
		
		System.out.println("Area of Rhombus = "+area);
		System.out.println("Perimeter of Rhombus = "+peri);
	}

	public static void main(String[] args) {
 
		findRhombus();
	}

}
