package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class BasicMovements {

	public static void main(String[] args) {
		System.out.println("Program 1");
		Button.waitForAnyPress();
		Motor.A.forward();
		Motor.B.forward();
		System.out.println("Forward");
		Button.waitForAnyPress();
		Motor.A.backward();
		Motor.B.backward();
		Button.waitForAnyPress();
		Motor.A.stop();
		Motor.B.stop();
	
		}
	}

