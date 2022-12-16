package plyaingwithinheritance2;

public class Test2 {

	public static void main(String[] args) {

     B b=new B();
     
     A a=new A();
     
     
     System.out.println(b instanceof A);
     
     System.out.println(a instanceof A);

     System.out.println(a instanceof B);

     System.out.println(b instanceof B);

	}

}
