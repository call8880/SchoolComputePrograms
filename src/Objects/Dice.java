package Objects;

public class Dice {

	//instance variables
	//private int rolls;
	private int value;
	
	public Dice(){
		value = (int)(Math.random() * 6) + 1;
	}
	
	public int Roll(){
		value = (int)(Math.random() * 6) + 1;
		return value;
	}
	
}
