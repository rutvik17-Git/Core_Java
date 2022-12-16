package thisisthat;

public class ThisEx2 {
	
	int x;
	
	void m1() {
		
		System.out.println(this.x );
		
		this.m2();
	}

	void m2() {
		System.out.println("Inside m2");
	}
}
