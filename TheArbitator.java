package Summative;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class TheArbitator {



	public static void main(String[] args) {
		UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
		LightSensor light = new LightSensor(SensorPort.S2);
		
		Behavior b1 = new Light(light);
		Behavior b2 = new Forward();		
		Behavior b3 = new Ultrasonic(sonar);
		Behavior b4 = new ExitButton();
		
		Behavior [] behaviors = {b2,b3,b1,b4};
		
		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();
		
		
	}

}
