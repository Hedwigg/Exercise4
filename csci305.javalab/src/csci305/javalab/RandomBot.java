package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player{
	
	
	Random random = new Random();

	Element [] options = new Element[5];
	Rock rock = new Rock("Rock");
	Paper paper = new Paper("Paper");
	Scissors scissors = new Scissors("Scissors");
	Lizard lizard = new Lizard("Lizard");
	Spock spock = new Spock("Spock");
	
	
	public RandomBot(String inName) {
		super(inName);
		//initialize the options array.
		options[0] = rock;
		options[1] = paper;
		options[2] = scissors;
		options[3] = lizard;
		options[4] = spock;
	}

	@Override
	public Element Play() {
		int ranNum = (int) (Math.random() * 5); 
		Element move = options[ranNum];	//use random int to pick an Element
		return move;
	}
}
