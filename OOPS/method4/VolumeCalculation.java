package method4;

public class VolumeCalculation {
	
	 void volume() {
		 System.out.println("Invalid shape");
	 }

	 void volume(double b, double h,double l) {
		 System.out.println("voume of triangle = "+(.5*b*h*l));
	 }
	  
      void volume(double l,double h,int w) {
   	  System.out.println("volume of rectanle = "+(l*h*w));
     }
	 
   	 void volume(int r) {
   		 System.out.println("volume of sphere = "+(4*22*r*r*r)/(3*7));
   	 }
   	 
	 
  	 void volume(double a) {
		 System.out.println("Volume of cube ="+(a*a*a));
	 }
	 
	 void volume(double r, float h)
	 {
		 System.out.println("Area of cylinder ="+(3.1412*r*r*h));
	 }
	 
	 void volume(float r, double h)
	 {
		 System.out.println("Area of cone ="+(0.3333*3.1412*r*r*h));
	 }

}
