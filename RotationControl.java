package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class RotationControl {

	public static void main(String[] args) {
		System.out.println("Program 3");
		Button.waitForAnyPress();
		Motor.A.rotate(1440);
		System.out.print(Motor.A.getTachoCount());
		Motor.A.rotate(0);
		System.out.print(Motor.A.getTachoCount());
		Button.waitForAnyPress();
		
	}

}
