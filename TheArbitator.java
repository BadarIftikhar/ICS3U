package Summative;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class TheArbitator {

	public static void main(String[] args) {
		Behavior b1 = new Light();
		Behavior b2 = new Forward();		
		Behavior b3 = new Ultrasonic();
		Behavior b4 = new ExitButton();
		
		Behavior [] behaviors = {b2,b3,b1,b4};
		
		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();
		
		
	}

}
