package methodAssgn;

import java.util.Scanner;

public class AreaOfRing {

	static void findRing() {
		
        double area,R,r;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the inner and outer radius of the Ring");
		
		r=sc.nextDouble();
		R=sc.nextDouble();
		
		area=3.1412*(R*R - r*r);
		
		
		System.out.println("Area of Ring = "+area);
	}
	
	 public static void main(String[] args) {
 
		findRing();		
	}

}
