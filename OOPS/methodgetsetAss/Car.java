package methodgetsetAss;

public class Car {

	int regno;
	int chassisno;
	String ctype;
	
	
	public int getRegno(){
		return regno;
	}
	
	public void setRegno(int regno) {
		this.regno=regno;
	}
	
	public int getChassisno() {
		return chassisno;
	}
	
	public void setChassisno(int chassisno) {
		this.chassisno=chassisno;
	}
	
	public String getCtype() {
		return ctype;
	}
	
	public void setCtype(String ctype) {
		this.ctype=ctype;
	}
}
