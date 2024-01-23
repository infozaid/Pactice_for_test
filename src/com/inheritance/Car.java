package com.inheritance;

public class Car extends Machine {

	@Override
	public void start() {
		super.start();
		System.out.println("Car is started");
	}
	
	public void wipeWindShield() {
		System.out.println("wiping windshield");
	}
	
	public void showInfo() {
		System.out.println("Car name is: "+name);
	}

}
