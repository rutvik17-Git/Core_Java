package methodgetsetAss;

public class App5 {

	public static void main (String[] args) {
		
		Bike b1=new Bike();
		
		b1.setBprice(123456);
		b1.setBtype("Moped");
		b1.setBmandate(123456);
		b1.setFueltype("Electric");
		b1.setBprice(150000);

		System.out.println(b1.getBprice());
		System.out.println(b1.getBtype());
		System.out.println(b1.getBmandate());
		System.out.println(b1.getFueltype());
		System.out.println(b1.getBprice());

	}
}
