package badar;

import hsa_new.Console;

/**
 * 
 * Scary Amusement Park Game
 * 
 * Feb. 28, 2017
 * @author Badar Iftikhar and Yusuf Khokhar
 *
 */

public class RollerCoaster 
{
	static Console c = new Console();
	public static void main(String[] args) 
	{

		//Random number generation occurs here
		//Depending on which number you get, that determines the character you are with
		int x = (int) (Math.random() *4) + 1;
		
		String playagain = null;
		do 
		{

			if (x == 1)
			{

				//TODO Finish story here
				c.println("Your Companion will be a body builder");
				c.println("As you are walking with your new friend you come upon a zombie who you think is a person in makeup.");
				c.println("The body builder attacks the zombie thinking it is real.");
				c.println("You don't even try to stop him because he's huge and its useless");
				c.println("He hits the zombie many times and its blood sprays everywhere");
				c.println("Next thing you know the zombie bites him and he screams extremely loud.");
				c.println("He turns around and looks at you with bloodstruck eyes. He charges at you.");

				c.println("Do you run to the left or right?");
				String direction;
				direction = c.readLine();

				while (!(direction.equalsIgnoreCase("right") || direction.equalsIgnoreCase("left")))
				{
					c.clear();
					c.println("Please enter either right or left");
					direction = c.readLine();
				}
				

				if (direction.equalsIgnoreCase("right")) 
				{
					c.println("You see a sign that says exit");
					c.println("As you open the door, you immediately feel a sharp pain as if youve been stabbed");
					c.println("You are dead.");
					//Ends the game
					//Asks if you want to play again
					c.println("Would you like to play again?");
					playagain = c.readLine();
				}


				else 
				{ 
					c.println("You are chased by a killer clown into a ferris wheel area");
					c.println("You see a gun and a knife on the floor. Do you choose the gun or knife");
					String Weaponanswer1;
					Weaponanswer1 = c.readLine();

					while (!(Weaponanswer1.equalsIgnoreCase("gun") || Weaponanswer1.equalsIgnoreCase("knife")))
					{
						c.clear();
						c.println("Please enter either gun or knife");
						Weaponanswer1 = c.readLine();
					}	


						if (Weaponanswer1.equalsIgnoreCase("knife"))
						{
							c.println("The knife was not sufficient to kill the clown");
							c.println("You are dead.");
							c.println("Would you like to play again?");
							playagain = c.readLine();
						}

						else 
						{
							c.println("You picked up the gun and run around the large round table");
							c.println("The clown starts to scream and you shoot him twice");

							int i = 0;
							while (i < 1 )
							{

								i = i + 1;

							}
							c.println("the gun is now empty so you pick up the knife and stab the clown");
							c.println("the clown dies and you survive the night, you win");
							c.println("Would you like to play again?");
							playagain = c.readLine();



						}

					}

				}
			





			if (x == 3)
			{

				//TODO Finish story here
	
				c.println("Your Companion will be Matthew S ~ DUMB GUY");
				c.println("As you are walking with Matthew the electricity in the park suddenly shuts off.");
				c.println(" All of a sudden you start hearing strange noises infront of you.");
				c.println(" Matthew starts to wonder off without you");
				c.println("Do you walk towards the noise to join Matthew or do you stay put?");
				String direction;
				direction = c.readLine();

				while (!(direction.equalsIgnoreCase("stay") || direction.equalsIgnoreCase("walk")))
				{
					c.clear();
					c.println("Please enter either stay or walk");
					direction = c.readLine();
				}


				if (direction.equalsIgnoreCase("walk")) 
				{
					c.println("In attempt to catch up with the dumb guy you start walking blindly in the dark");
					c.println("Some how you bump into Matthew S and he gets startled");
					c.println("He tackles you to the floor based on natural instinct.");
					c.println("Your head crashes to the floor and you die from a sever concussion.");
					//Ends the game
					//Asks if you want to play again
					c.println("Would you like to play again?");
					playagain = c.readLine();
				}


				else 
				{ 
					c.println("You pull out your phone to use as a flashlight ");
					c.println("suddenly you see a scary shadow behind Matthew S and yourself");
					c.println("Do you wait for the shadow to pass?");
					String Weaponanswer1;
					Weaponanswer1 = c.readLine();

					while (!(Weaponanswer1.equalsIgnoreCase("no") || Weaponanswer1.equalsIgnoreCase("yes")))
					{
						c.clear();
						c.println("Please enter either yes or no");
						Weaponanswer1 = c.readLine();
					}
						


						if (Weaponanswer1.equalsIgnoreCase("yes"))
						{
							c.println("suddenly you feel a sharp pain in your spine");
							c.println("You have died.");
							c.println("Would you like to play again?");
							playagain = c.readLine();
						}

						else 
						{
							c.println("You run for your life with Matthew S and stumble upon a roller coaster");
							c.println("Both you and Matthew S go on the roller coaster.");
							int i = 0;
							while (i < 1 )
							{

								i = i + 1;

							}
							c.println("Your friend Matthew S didnt check the back of the roller coaster.");
							c.println("You see a man with an axe trying to kill you and your friend as the ride is in operation");
							c.println("You sacfice Matthew S to save yourself. as the axe plunges into your friend the scary man slips and falls off the ride");
							c.println("Although you lost your buddy Matthew S, you find an exit sign and escape the horrible place");
							c.println("Would you like to play again?");
							playagain = c.readLine();

						}

			
				}while(playagain.equals("yes"));
		
		
			}
	//private static void output(String string) {
		// TODO Auto-generated method stub
		
		if (x == 2)
		{

			//TODO Finish story here
			c.println("Your Companion will be a gangster");
			c.println("You see a  red bandana and a blue one. Which do you choose?");
			String bandana;
			bandana = c.readLine();

			while (!(bandana.equalsIgnoreCase("blue") || bandana.equalsIgnoreCase("red")))
			{
				c.clear();
				c.println("Please enter either blue or red");
				bandana = c.readLine();
			}
			
			if (bandana.equalsIgnoreCase("blue")) 
			{
				int y = (int) (Math.random() *4) + 1;
				if (y == 1 || y == 2);
				{
					c.println("You run into a gang of people wearing red and get shot repeatedly.");
					c.println("You are dead.");
				}
				
				c.println("Would you like to play again?");
				playagain = c.readLine();
			
				if (y == 3 || y == 4);
				{
					c.println("You run into a gang of people wearing blue clothing");
					c.println("They greet you and let you pass through the alley way.");
					c.println("You hear screams in the distance of the park so you feel uncomfortable and leave.");
				}
				
			else if (bandana.equalsIgnoreCase("red")) 
				{
					int y = (int) (Math.random() *4) + 1;
					
					if (y == 1 || y == 2);
					{
						c.println("You run into a gang of people wearing blue and get stabbed repeatedly.");
						c.println("You are dead.");
					}
					
					c.println("Would you like to play again?");
					playagain = c.readLine();
				
					if (y == 3 || y == 4);
					{
						c.println("You run into a gang of people wearing red clothing");
						c.println("They greet you and let you pass through the alley way.");
						c.println("You hear screams in the distance of the park so you feel uncomfortable and leave.");
					}
				}
			}
		}
	}
}
}
