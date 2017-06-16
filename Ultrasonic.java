package Summative;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class Ultrasonic implements Behavior {
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	private boolean suppressed = true;

	public boolean takeControl() {
		if (sonar.getDistance() < 10)
		return true;
				return false;
	}

	public void action() {
		Motor.A.forward();
		if (sonar.getDistance() < 10) {
			Motor.A.forward();
			Motor.B.forward();
		}
		while (!suppressed) {

		}
		Thread.yield();
	}

	public void suppress() {
		suppressed = true;

	}
}
