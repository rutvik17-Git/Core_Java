package methodAssgn;

import java.util.Scanner;

public class AreaOfParallelogram {
	
	static void findParallelogram() {
		
       double area,peri,l,b,h;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length and witdh and height of the Parallelogram");
		
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
		
		area=l*h;
		peri=2*(l+b);
		
		System.out.println("Area of Parallelogram = "+area);
		System.out.println("Perimeter of Parallelogram = "+peri);
		
	}

	public static void main(String[] args) {
 
		findParallelogram();
		
	}

}