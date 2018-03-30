package org.martinjuarez77.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Martin says: Hello World Ping " + i );
			Thread.sleep(1000);
		}
	}
}
