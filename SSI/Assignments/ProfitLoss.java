package Assignments;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cp,sp,profit,loss;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter cost price and selling price of product");
		
		cp=sc.nextDouble();
		sp=sc.nextDouble();
		
		if(cp<sp)
		{
			profit=sp-cp;
			System.out.println("Seller has made profit of "+profit);
		}
		else if(cp>sp)
		{
			loss=cp-sp;
			System.out.println("Seller has incurred loss of "+loss);
		}
		else
		{
			System.out.println("Dont get any profit or loss");

		}
		
		
		
		

	}

}
