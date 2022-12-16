package methodAssgn;

import java.util.Scanner;

public class FaherenheitToCelsius {

	static void convertToCelcius() {
		
       double f,c;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the tempreture in Fahrenheit");
		
		f=in.nextDouble();
		
		c=(f-32)*5/9;
		
		System.out.println("Tempreture in Fahrenheit" +f);
		System.out.println("Tempreture in Celsius" +c);
	}
	public static void main(String[] args) {

		convertToCelcius();
		
		
	}

}
