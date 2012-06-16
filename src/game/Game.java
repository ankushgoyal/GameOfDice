package game;

import java.util.Random;

public class Game {
	
	public static void main(String[] args) {
		Player playerA = new Player();
		Player playerB = new Player();
		
		for(int i = 0; i < 10000000; i++) {
			int result1 = playerA.roll();
			if(result1 == 4) {
				playerA.incrementWins();
				continue;
			}
			
			int result2 = playerB.roll();
			if(result2 == 5) {
				playerB.incrementWins();
			}
					
		}
		
		System.out.println("PlayerA win %age: " + playerA.getWins()/10000000.0 * 100);
		System.out.println("PlayerB win %age: " + playerB.getWins()/10000000.0 * 100);
	}

}
