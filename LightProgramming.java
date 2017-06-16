package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

public class LightProgramming {

	public static void main(String[] args) {
	 System.out.print("Light sensor program");
	 LightSensor light = new LightSensor(SensorPort.S2);
	 Button.waitForAnyPress();
	 for (int i=0; i<=10000; i++){
		 light.getLightValue();
		 if(light.getLightValue() <=50){
			 Motor.A.setSpeed(1020);
			 Motor.B.setSpeed(1020);
			 Motor.A.forward();
			 Motor.B.forward();
		 }
		 else{
			 Motor.B.stop();
			 
		 }
	 }
	  
	

	}

}
