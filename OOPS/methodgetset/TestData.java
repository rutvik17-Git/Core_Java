package methodgetset;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated methodAssgn stub

		
		Data d1=new Data();
		
		System.out.println("Before");
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d1.z);
		
		d1.x=100;
		d1.y=200;
		d1.z=300;
		
		System.out.println("After");
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d1.z);
		
	}

}
