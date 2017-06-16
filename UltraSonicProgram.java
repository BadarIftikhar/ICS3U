package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

public class UltraSonicProgram {

	public static void main(String[] args) {
		System.out.print("UltraSonic Sensor Program");
		UltrasonicSensor Ultra = new UltrasonicSensor(SensorPort.S4);
		Button.waitForAnyPress();
		Ultra.ping();
		Delay.msDelay(20);
		Ultra.getDistance();
		for (int j = 0; j<100000; j++){
			if(Ultra.getDistance()<=25){
				Motor.A.setSpeed(720);
				Motor.B.setSpeed(450);
				Motor.A.backward();
				Motor.B.backward();
			}
			else if(Ultra.getDistance()>25) {
				Motor.A.setSpeed(720);
				Motor.B.setSpeed(450);
				Motor.A.forward();
				Motor.B.forward();
			}
			else{
				Motor.A.stop();
				Motor.B.stop();				
				
			}
		}
	}

}

