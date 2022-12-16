package MethodExamples;

//Wap to calculate gross salalry
//where basic salary is the input
//write a methods for that
//allowences are as follows
//ta 20% of the basic sal
//da isn90% of BS
//HRA is 15% of BS
//gs=bs+ta+da+hra

public class MethodExamples4 {
	static double salaryCalculation(double bs){

	double gs=0,ta=0,da=0,hra=0;
	
	ta=.2*bs;
	da=.9*bs;
	hra=.15*bs;
	
	gs=ta+da+hra+bs;
	
		return gs;
}
	
	public static void main(String[] args) {
		
    System.out.println(salaryCalculation(10000.0));
   	
	}
	
}

