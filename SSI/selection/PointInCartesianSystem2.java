package selection;

import java.util.Scanner;

public class PointInCartesianSystem2 {

	public static void main(String[] args) {
		
		int x,y;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the co-ordinates of the point");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0&&y>0)	
			{
				System.out.println("Point lies in the 1st quadrant"); 
			}
		
		
		if(x<0&&y>0)
			{
				System.out.println("Point lies in the 2nd quadrant"); 
			}
		
		
		if(x<0&&y<0)
		    {
		    	System.out.println("Point lies in the 3rd quadrant");
		    }
		
		
		if(x>0&&y<0)
		{
		    	System.out.println("Point lies in the 4th quadrant");
		    }

		
		if(x!=0&&y==0)
			{
				System.out.println("Point lies on the x-axis");
			}
	
		if(x==0&&y!=0)		
			{
				System.out.println("Point lies on the y-axis");
			}
		
		
		if(x==0&&y==0)
		    {
			    System.out.println("Point is origin");
		    }
		
	}

}
