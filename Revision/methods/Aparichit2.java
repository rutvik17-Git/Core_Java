package methods;

public class Aparichit2 {
	
	public static  void m(){
		
		System.out.println("I m method");
         m();
	}

	public static void main(String[] args) {
	
		System.out.println("I am in main");
		
		m();
		
		System.out.println("End of main");

	}

}
