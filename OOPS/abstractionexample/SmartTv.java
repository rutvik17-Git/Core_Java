package abstractionexample;

public class SmartTv {

	public void on() {
		
		System.out.println("Starting the TV");
		
		start();
	}

	private void start() {

      System.out.println("Boot TV");
      System.out.println("Start apps");
      System.out.println("Display Dashboard");	
	} 
	
	public void off() {
		
	 System.out.println("Closing all the apps..");
   	 System.out.println("Wait while shutdown");
   	 
   	 stop();
	}
	
	private void stop() {
		
     System.out.println("closing all apps..");
     System.out.println("Realese memory");
     System.out.println("Good Bye Message");
	 }
}
