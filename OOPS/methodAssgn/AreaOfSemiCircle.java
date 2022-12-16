package methodAssgn;

import java.util.Scanner;

public class AreaOfSemiCircle {

	static void findSemicircle() {
		
	double area,circ,r,pi=3.1412;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of the SemiCircle");
		
		r=sc.nextDouble();
		
		area=(3.1412*r*r)/2;
		circ=(3.1412*r)+(2*r);
		
		System.out.println("Area of SemiCircle = "+area);
		System.out.println("Circumfrence of SemiCircle = "+circ);

	}
	public static void main(String[] args) {
 
		findSemicircle();
	}

}
