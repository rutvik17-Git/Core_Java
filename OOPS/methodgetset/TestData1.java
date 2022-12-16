package methodgetset;

public class TestData1 {
	public static void main(String[] args) {
		
		Data d1=new Data();
		
		System.out.println("Before");
		System.out.println(d1.x);
		
		d1.setX(100);
		

		System.out.println("After");
		System.out.println(d1.x);
	}
	
	

}
