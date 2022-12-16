package thisisthat;

public class ThisEx4 {
	
      ThisEx4(){
		System.out.println("0 args  contructor="+this );
	}

      ThisEx4(int x){
    	  this();
  		System.out.println("1 args  contructor="+this );
  	}
        
      ThisEx4(int x,int y){
    	  this(x);
  		System.out.println("2 args  contructor="+this );
  	}

}
