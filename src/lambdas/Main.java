package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		String[] colours = {"green", "blue", "black", "brown", "pink", "grey"};
	
		Player player1 = new Player("Alex", 100);
		Player player2 = new Player("Alex", 80);
		Player player3 = new Player("Alex", 80);
		Player player4 = new Player("Alex", 91);
		
		Player[] players = {player1, player2, player3, player4};
		
		Arrays.sort(players, (Player p1, Player p2) -> 
				p1.getScore() - p2.getScore()
			);
		
		for(Player player : players) {
			System.out.println(player);
		}
		
		
	}
}
