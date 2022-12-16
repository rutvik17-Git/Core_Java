package MethodExamples;

public class MethodExamples {

	static void m1() {
		System.out.println("This is the methodAssgn with no return type");
	}
	
	static int m2() {
		System.out.println("This is the methodAssgn with  return type");
        return 10;
	}
	
	public static void main(String[] args) {
		
		m1();
		int x=m2();
		
		System.out.println(x);
		
		System.out.println(m2());

	}
	
}
