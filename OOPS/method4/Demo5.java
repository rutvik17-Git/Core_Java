package method4;

public class Demo5 {

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	int x,y,z;
	
	Demo5(){
	}
	
	Demo5(int x){
		this.x=x;
	}
 
	Demo5(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	Demo5(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}


}
