package memorymanagement;

public class Test2 {
	
	static {
		System.out.println("Inside static block of test class");
	}
	

     {
		System.out.println("Inside non static block of test class");
	}
	
	public static void main(String[] args) {
		 
		System.out.println("First line of main");
		
		Test2 t1=new Test2();
		Data2 d2=new Data2();
	}

}
