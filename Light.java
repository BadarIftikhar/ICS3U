package Summative;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Light implements Behavior {
	private boolean suppressed = true;
	private LightSensor light;

	public Light(LightSensor ls) {
		this.light = ls;
	}
	
	@Override
	public boolean takeControl() {
		if(light.getLightValue() < 38){
			return true;
		}
		return false;

	}

	@Override
	public void action() {
		suppressed = false;
		Motor.A.forward();
		Motor.B.forward();
		while (!suppressed) {
			Thread.yield();
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
}
