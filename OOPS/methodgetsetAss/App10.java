package methodgetsetAss;

public class App10 {

	public static void main(String[] args) {
		// TODO Auto-generated methodAssgn stub

		Country c=new Country();
		
		c.setCountrycode(121);
		c.setCountryname("Canada");
		c.setCountrypoppulation(456642233);
		c.setTotaldistricts(450);
		c.setCountrycapital("Ottawa");
		
		System.out.println(c.getCountrycode());
		System.out.println(c.getCountryname());
		System.out.println(c.getCountrypoppulation());
		System.out.println(c.getTotaldistricts());
		System.out.println(c.getCountrycapital());

	}

}
