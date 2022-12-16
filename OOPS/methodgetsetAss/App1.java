package methodgetsetAss;

public class App1 {

	public static void main(String[] args) {
	
		Account a=new Account();
						
			a.setAccno(156234);
			a.setAcctype("saving");
			a.setAccholdername("R Kamble");
			a.setAccbalance(1000);
			
	
			System.out.println(a.getAccno());
			System.out.println(a.getAcctype());
			System.out.println(a.getAccholdername());
			System.out.println(a.getAccbalance());
			
	}

}
