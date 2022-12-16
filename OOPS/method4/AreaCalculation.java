package method4;

public class AreaCalculation {
	
	 void area() {
		 System.out.println("Invalid shape");
	 }

	 void area(double b, double h) {
		 System.out.println("Area of triangle = "+(.5*b*h));
	 }
	 
	 void area(double r) {
		 System.out.println("Area of circle = "+(3.1412*r*r));
	 }
	 
	 void area(int l, double w) {
		 System.out.println("Area of rectangle = "+(l*w));
	 }
	 
	 void area(int l,int h) {
		 System.out.println("Area of parallelogram ="+(l*h));
	 }
	 
	 void area(double d1, float d2)
	 {
		 System.out.println("Area of Rhombus ="+(d1*d2)/2);
	 }

	 void area(int r1,int r2,int R1,int R2) {
		 System.out.println("Area of Ring ="+(3.1412*(R1*R2-r1*r2)));
	 }
	 
	 void area(int r) {
		 System.out.println("Area of semicircle ="+(3.1412*r*r)/2);		 
	 }
	 
	 void area(float r) {
		 System.out.println("Area of square ="+(r*r));
	 }
	 
	 void area(int l,int b,int h) {
		System.out.println("Area of trapezium = "+(h/2*(l+b))); 
	 }
}
