package inh4;

public class Test {

	public static void main(String[] args) {

		A a=new A();
		
		B b=new B();
		
		b.a=100;
		b.b=200;
		b.c=300;
		b.d=500;
		
		a=b;    //object slicing takes place here
		System.out.println(a.a);
		System.out.println(a.b);
	}

}
