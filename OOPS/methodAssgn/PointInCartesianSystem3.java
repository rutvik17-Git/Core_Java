package methodAssgn;

import java.util.Scanner;

public class PointInCartesianSystem3 {
	
	static void cartesianPoint() {
		int x,y;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the co-ordinates of the point");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0&&y>0)	
			{
				System.out.println("Point lies in the 1st quadrant"); 
			}
		
		
		else if(x<0&&y>0)
			{
				System.out.println("Point lies in the 2nd quadrant"); 
			}
		
		
		else if(x<0&&y<0)
		    {
		    	System.out.println("Point lies in the 3rd quadrant");
		    }
		
		
		else if(x>0&&y<0)
		{
		    	System.out.println("Point lies in the 4th quadrant");
		    }

		
		else if(x!=0&&y==0)
			{
				System.out.println("Point lies on the x-axis");
			}
	
		else if(x==0&&y!=0)		
			{
				System.out.println("Point lies on the y-axis");
			}
		
		else
		    {
			    System.out.println("Point is origin");
		    }
		
	}

	public static void main(String[] args) {
		
		cartesianPoint();
	}

}
