package csci305.javalab;

public class Outcome {
	public String first;
	public String second;
	
	public Outcome(Lizard lizard, Element x) {
		if (x.getName().equals("Paper"))
		{
			first = "Lizard Eats Paper";
			second = "Win";
		}else if (x.getName().equals("Spock"))
		{
			first = "Lizard poisons Spock";
			second = "Win";
		}else if(x.getName().equals())
	}

	public Outcome(Paper paper, Element x) {
		// TODO Auto-generated constructor stub
	}

	public Outcome(Rock rock, Element x) {
		// TODO Auto-generated constructor stub
	}

	public Outcome(Scissors scissors, Element x) {
		// TODO Auto-generated constructor stub
	}

	public Outcome(Spock spock, Element x) {
		// TODO Auto-generated constructor stub
	}
	
}


/*Outcome has two instance variables representing the outcome of the compareTo method.

The first value contained in the Outcome class contains a string describing one of the following outcomes:

Scissors cut Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitate Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors

For a tie, you should output a string such as ``Rock equals Rock''.

The second value the Outcome should contain the value of the round outcome:

Win
Lose
Tie
*/