package Summative;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.nxt.LightSensor;

public class Light implements Behavior {
private boolean suppressed = true;
private LightSensor light = new LightSensor(SensorPort.S2);

	@Override
	public boolean takeControl() {
		 if(light.getLightValue() < 30){
			return true;
		 }
		return false;
		
	}

	@Override
	public void action() {
		Motor.A.forward();
		Motor.B.forward();
				while(light.getLightValue()> 30){
				Motor.A.rotate(5);
				}

				while (!suppressed)
			 {
				 Thread.yield();
			 }
		 
	}

	@Override
	public void suppress() {
		suppressed = true;
		
	}
}
