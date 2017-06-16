package Summative;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;
	// Exit program.java
public class ExitButton implements Behavior{
	//Takes control of the robot when the Escape Button on the NXT is pressed down
	@Override
	public boolean takeControl() {
		if(Button.ESCAPE.isDown())
		{ 
			return true;
		}
		return false;
	}
	
	// Exits the program
	@Override
	public void action() {
		System.exit(0);
	}
	
	//Action is never suppressed
	@Override
	public void suppress() {
		
	}
}	

