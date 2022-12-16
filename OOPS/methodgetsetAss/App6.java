package methodgetsetAss;

public class App6 {

	public static void main(String[] args) {
		
		Branch b=new Branch();
	  
		b.setBranchno(12);
		b.setBranchtype("Urban");
		b.setbranchaddr("Yerwada");
	
		System.out.println(b.getBranchno());
		System.out.println(b.getBranchtype());
		System.out.println(b.getBranchaddr());


	}
}
