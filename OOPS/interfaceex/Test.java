package interfaceex;

public class Test {

	public static void main(String[] args) {
		
		MyKitchen mk;
		
		mk= new PaneerButterMasala();
		mk.toCook();
		
		mk=new MethiPaneer();
		mk.toCook();
		
		mk=new PaneerPakoda();
		mk.toCook();
		
		mk=new PalakPaneer();
		mk.toCook();
		

	}

}
