package Assignments;

import java.util.Scanner;

public class PointsOnSameLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 double x1,y1,x2,y2,x3,y3,m,n;
		 
		 Scanner in=new Scanner(System.in);
		 
		 System.out.println("Enter the points x1,y1"); 
		
		 x1=in.nextDouble();
		 y1=in.nextDouble();

		 System.out.println("Enter the points x2,y2"); 
		 x2=in.nextDouble();
		 y2=in.nextDouble();
		 
		 System.out.println("Enter the points x3,y3"); 
		 x3=in.nextDouble();
		 y3=in.nextDouble();
		 
		 //find slope of the 2 line 
		 
		 m=(y2-y1)/(x2-x1);
		 n=(y3-y2)/(x3-x2);
		 
		 if(m==n)
            System.out.println("All the points lie on the same line");
		 else
			 System.out.println("All the points do not lie on the same line");
		 
	}

}
