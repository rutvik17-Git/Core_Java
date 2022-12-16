package methodgetsetAss;

public class Bank {

	int bankid;
	String bankname;
	String banktype;
	long totalcustomers;
	
	public int getBankid() {
		return bankid;
	}
	
	public void setBankid(int bankid) {
		this.bankid=bankid;
	}
	
	public String getBankname() {
		return bankname;
	}
	
	public void setBankname(String bankname) {
		this.bankname=bankname;
	}
	  
	public String getBanktype() {
		return banktype;
	}
	
	public void setBanktype(String banktype) {
		this.banktype=banktype;
	}
	
	public long getTotalcustomers() {
		return totalcustomers;
	}
	
	public void setTotalcustomers(long totalcustomers) {
		this.totalcustomers=totalcustomers;
	}
	
}
