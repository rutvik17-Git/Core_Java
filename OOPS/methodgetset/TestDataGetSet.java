package methodgetset;

public class TestDataGetSet {

	public static void main(String[] args) {
		
		DataGetSet d2=new DataGetSet();
		
		System.out.println("Befor");
		System.out.println(d2.getX());
		System.out.println(d2.getY());
		System.out.println(d2.getZ());
		
		d2.setX(10);
		d2.setY(20);
		d2.setZ(30);
		
		System.out.println("After");
		System.out.println(d2.getX());
		System.out.println(d2.getY());
		System.out.println(d2.getZ());
	}

}
