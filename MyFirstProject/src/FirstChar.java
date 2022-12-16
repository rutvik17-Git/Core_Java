
import java.util.Scanner;

public class FirstChar{
	
	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  
	  System.out.println("Enter any String");
	  
	  char x;
	  x=sc.next().charAt(2);
	 
	  
	  System.out.println("You hav entered "+x);
	}
}