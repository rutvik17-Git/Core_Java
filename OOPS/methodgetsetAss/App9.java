package methodgetsetAss;

public class App9 {

	public static void main(String[] args) {
	
		Company c=new Company();
		
		c.setCid(10);
		c.setCname("Shirke");
		c.setCaddr("Mundhawa");
		c.setCphoneno(1235454566);
			
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		System.out.println(c.getCaddr());
		System.out.println(c.getCphoneno());

	}

}
