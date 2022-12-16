package methodgetsetAss;

public class App8 {

	public static void main(String[] args) {
		
		City c=new City();
		
		c.setCitycode(411006);
		c.setCityname("Pune");
		c.setCitytype("Smart");
		c.setTotalareas(150);
		
		System.out.println(c.getCitycode());
		System.out.println(c.getCityname());
		System.out.println(c.getCitytype());
		System.out.println(c.getTotalareas());

	}

}
