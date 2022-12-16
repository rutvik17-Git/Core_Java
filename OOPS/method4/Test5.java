package method4;

public class Test5 {

	public static void main(String[] args) {


		Demo5 d1=new Demo5();
		
		Demo5 d2=new Demo5(100);
		
		Demo5 d3=new Demo5(100,200);
		
		Demo5 d4=new Demo5(600,700,800);
		
		System.out.println(d4.getX());

		d4.setX(500);
		 
		System.out.println(d4.getX());

	}

}
