package passingargs;

public class Test1 {

	public static void main(String[] args) {
	
		Data1 d1=new Data1();
		
		d1.a=10;
		d1.b=20;
		
		System.out.println("Before method call in main");
		System.out.println("a="+d1.a+" b="+d1.b);
		
		d1.swap(d1); 
		
		System.out.println("After method call in main");
		System.out.println("a="+d1.a+" b="+d1.b);
		
	}

}
