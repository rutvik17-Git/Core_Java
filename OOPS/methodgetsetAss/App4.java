package methodgetsetAss;

public class App4 {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		b.setBankid(1234);
		b.setBankname("Bank of Baroda");
		b.setBanktype("Commercial");
		b.setTotalcustomers(1236544897);
		
		System.out.println(b.getBankid());
		System.out.println(b.getBankname());
		System.out.println(b.getBanktype());
		System.out.println(b.getTotalcustomers());

	
	}

}
