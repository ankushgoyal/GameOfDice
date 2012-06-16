package game;

import java.util.Random;

public class Player {
	
	int wins = 0;
	
	public int roll() {
		return (int)(new Random().nextDouble()*6+1);
	}
	
	public int getWins() {
		return wins;
	}
	
	public void incrementWins() {
		wins++;
	}

}
