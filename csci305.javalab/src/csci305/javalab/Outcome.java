package csci305.javalab;

public class Outcome {
	public String first;
	public String second;
	
	public Outcome(Lizard lizard, Element x) {
		switch(x.getName())
		{
			case "Paper":
				first = "Lizard Eats Paper";
				second = "Win";
				
			case "Spock":
				first = "Lizard poisons Spock";
				second = "Win"; 
				
			case "Rock":
				first = "Lizard poisons Spock";
				second = "Lose";
				
			case "Sissors":
				first = "Sissors decapitate Lizard";
				second = "Lose";
			case "Lizard":
				first = "Lizard equals Lizard";
				second = "Tie";
			default:
				first = "error";
				second = "error";
		}
	}

	public Outcome(Paper paper, Element x) {
		switch(x.getName())
		{
			case "Rock":
				first = "Paper covers Rock";
				second = "Win";
				
			case "Spock":
				first = "Paper disproves Spock";
				second = "Win"; 
				
			case "Lizard":
				first = "Lizard eats Paper";
				second = "Lose";
				
			case "Sissors":
				first = "Sissors cut Paper";
				second = "Lose";
			case "Paper":
				first = "Paper equals Paper";
				second = "Tie";
			default:
				first = "error";
				second = "error";
		}
	}

	public Outcome(Rock rock, Element x) {
		switch(x.getName())
		{
			case "Sissors":
				first = "Rock crushes Sissors";
				second = "Win";
				
			case "Lizard":
				first = "Rock crushes Lizard";
				second = "Win"; 
				
			case "Paper":
				first = "Paper covers Rock";
				second = "Lose";
				
			case "Spock":
				first = "Spock vaporizes Rock";
				second = "Lose";
			case "Rock":
				first = "Rock equals Rock";
				second = "Tie";
			default:
				first = "error";
				second = "error";
		}
	}

	public Outcome(Scissors scissors, Element x) {
		switch(x.getName())
		{
			case "Paper":
				first = "Sissors cut Paper";
				second = "Win";
				
			case "Lizard":
				first = "Sissors decapitate Lizard";
				second = "Win"; 
				
			case "Rock":
				first = "Rock crushes Sissors";
				second = "Lose";
				
			case "Spock":
				first = "Spock smashes Sissors";
				second = "Lose";
			case "Sissors":
				first = "Sissors equals Sissors";
				second = "Tie";
			default:
				first = "error";
				second = "error";
		}
	}

	public Outcome(Spock spock, Element x) {
		switch(x.getName())
		{
			case "Sissors":
				first = "Spock smashes Sissors";
				second = "Win";
				
			case "Rock":
				first = "Spock vaporizes Rock";
				second = "Win"; 
				
			case "Lizard":
				first = "Lizard poisons Spock";
				second = "Lose";
				
			case "Paper":
				first = "Paper disproves Spock";
				second = "Lose";
			case "Spock":
				first = "Spock equals Spock";
				second = "Tie";
			default:
				first = "error";
				second = "error";
		}
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