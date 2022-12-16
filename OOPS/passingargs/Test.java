package passingargs;

public class Test {
	
	public static void main(String[] args) {
		
		Data d=new Data();
		
		int a=10,b=20;
		
		System.out.println("Before Method Call in main");
		System.out.println("a="+a+" b="+b);
		
		d.swap(a, b); //pass by value
		
		System.out.println("After Method Call in main");
		System.out.println("a="+a+" b="+b);
		
	}

}
