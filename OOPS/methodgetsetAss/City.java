package methodgetsetAss;

public class City {

	int citycode;
	String cityname;
	String citytype;
	int totalareas;
	
	public int getCitycode(){
		return citycode;
	}
	
	public void setCitycode(int citycode) {
		this.citycode=citycode;
	}
	
	public String getCityname() {
		return cityname;
	}
	
	public void setCityname(String cityname) {
		this.cityname=cityname;
	}
	
	public String getCitytype() {
		return citytype;
	}
	
	public void setCitytype(String citytype) {
		this.citytype=citytype;
	}
	
	public int getTotalareas() {
		return totalareas;
	}
	
	public void setTotalareas(int totalareas) {
		this.totalareas=totalareas;
	}
}
