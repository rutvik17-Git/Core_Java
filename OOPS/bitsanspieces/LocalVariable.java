package bitsanspieces;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated methodAssgn stub
		int a=10;  // local var
		
		a++;
		System.out.println("a ="+a);
	
		
		{
			int x=100;   //local var
			
			System.out.println("x ="+x);
			x++;
		}
		
		//System.out.println("x ="+x);

	}

}
