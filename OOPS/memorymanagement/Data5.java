package memorymanagement;

public class Data5 {
	
	static{
	 System.out.println("In Static block");		
	}
	
	{
		System.out.println("In Non static block");
	}
	
	Data5(){
		System.out.println("In constructor");
	}

}
