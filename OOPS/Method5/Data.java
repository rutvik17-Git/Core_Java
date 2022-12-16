package Method5;

public class Data {
	
	int x,y,z;
	
	void setData(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	void showData() {
		System.out.println("x = "+this.x);
		System.out.println("y ="+this.y);
		System.out.println("z ="+this.z);
	}
}
