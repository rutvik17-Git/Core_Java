package Assignments;

import java.util.Scanner;

public class PointInCartesianSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1,y1,x2,y2,r;
		float pc;
		
		Scanner in=new Scanner(System.in);
		
	    System.out.println("Enter coordinates of the circle x1,y1");
	    x1=in.nextInt();
	    y1=in.nextInt();
	    
	    System.out.println("Enter teh radius of the circle");
	    r=in.nextInt();
	    
	    System.out.println("Enter point coordinates of the circle x2,y2");
	    x2=in.nextInt();
	    y2=in.nextInt();
	    
	    pc=sqrt(pow(x2-x1,2)+pow(y2-y1,2));
	    
	    if(pc>r)
	    	System.out.println("Point lies outside the cirlce ");
	    else if(pc<r)
	    	System.out.println("Point lies inside the cirlce ");
	    else if(pc==r)
	    	System.out.println("Point lies on the the cirlce ");
	    else
	    	System.out.println("Wrong Entry");

	}

	private static float sqrt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int pow(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
