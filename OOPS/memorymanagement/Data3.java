package memorymanagement;

public class Data3 {

	static int z=100;
	
	int x=300;
	
	static {
		System.out.println("Inside static block z = "+z);
	}
	
	{
		System.out.println("Inside non static block of test class");
	}
	
}
