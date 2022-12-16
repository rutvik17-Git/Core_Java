package passingargs;

public class Data {

 void swap(int a,int b) {
	int t;
	t=a;
	a=b;
	b=a;
	
	System.out.println("Method call in Swap");
	System.out.println("a="+a+" b="+b);
  }
}
