package methodgetsetAss;

public class App7 {

	public static void main(String[] args) {
		
		Car c=new Car();
		
		c.setRegno(123);
		c.setChassisno(123664);
		c.setCtype("CNG");
		
		System.out.println(c.getRegno());
		System.out.println(c.getChassisno());
		System.out.println(c.getCtype());

	}

}
