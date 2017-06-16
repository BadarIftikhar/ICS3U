package Summative;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Forward implements Behavior {


	private boolean suppressed = true;

	public boolean takeControl() {

		return true;

	}

	public void action() {
		suppressed = false;
		Motor.A.forward();

		while (!suppressed)
		{
			Thread.yield();
		}
	}


	public void suppress() {
		suppressed = true;

	}

}



