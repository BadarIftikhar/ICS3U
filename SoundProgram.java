package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.SoundSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

public class SoundProgram {

	public static void main(String[] args) {
		System.out.print("Sound Sensor Program");
		SoundSensor Sound = new SoundSensor(SensorPort.S3);
		Button.waitForAnyPress();
		for (int j=0; j<10000; j++){
			Sound.readValue();
			if (Sound.readValue()<35){
				Motor.A.setSpeed(7000);
				Motor.B.setSpeed(7000);
				Motor.A.forward();
				Motor.B.forward();
			}
			else if(Sound.readValue()>35){
				Motor.A.setSpeed(7000);
				Motor.B.setSpeed(7000);
				Motor.A.backward();
				Motor.B.backward();
				
			}
			else{
				Motor.A.stop();
				Motor.B.stop();
			}
		}
	}
}


		
	
	

	
