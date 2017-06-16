package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;


public class TachoMeter {

	public static void main(String[] args) {
		System.out.println("Program 2");
		Motor.A.setSpeed(2);
		Motor.B.setSpeed(2);
		Motor.A.forward();
		Motor.B.forward();
		Delay.msDelay(2000);
		LCD.drawString("Program 2", 0, 0);
		Motor.A.stop();
		Motor.B.stop();
		LCD.drawString(Motor.A.getTachoCount() + "", 0, 1);
		Motor.A.backward();
		Motor.B.backward();
		
	}

}
