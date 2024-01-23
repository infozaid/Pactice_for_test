package com.inheritance;

public class App {
	
	public static void main(String[] args) {
		Machine mach1=new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car c=new Car();
		
		c.start();
		c.wipeWindShield();
		c.showInfo();
	}

}
