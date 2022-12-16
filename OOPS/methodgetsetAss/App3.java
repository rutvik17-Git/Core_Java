package methodgetsetAss;

public class App3 {
	
	public static void main(String[] args) {
		
		Autorikshaw a=new Autorikshaw();
		
		a.setRegno(12345);
		a.setOwnername("Rutvik");
		a.setDrivername("Sayyam");
		a.setChassisno(963254);
		
		System.out.println(a.getRegno());
		System.out.println(a.getOwenername());
		System.out.println(a.getDrivername());
		System.out.println(a.getChassisno());

	}
}

