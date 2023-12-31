package poker;

import java.util.LinkedList;
import java.util.List;

public class Poker {
	
	/**
	 * Main function of the Poker game. It generates a card deck, invokes giveCard() method
	 * which gives cards to table and to every player from players List.
	 * Creates and invokes a Resulter class for scaling the combinations
	 * of players' hands. Outputs results.
	 * @param players List of entities who play poker
	 */
	public void play(List<Entity> players) {
		
		Cards deck = new Cards();
		
		LinkedList<Entity> table = new LinkedList<>();
		
		table.add(new Table());
		
		giveCard(players, deck);
		
		giveCard(table, deck);
		
		System.out.println("TABLE:");
		table.get(0).getCards();
		
		for(Entity p : players) {
			Resulter res = new Resulter(p, table.get(0));
			
			System.out.println("\nPlayer " + (players.indexOf(p) + 1) + ":");
			p.getCards();
			
			System.out.println(res.getCombs() + "\n");
		}
	}
	
	/**
	 * Gives card from deck to Entity (either player or table)
	 * @param players List of players of list of one single table
	 * @param deck Takes card deck of Cards deck
	 */
	private void giveCard(List<Entity> players, Cards deck) {
		for(Entity p : players) {
			for(int i = 0; i < p.cardnum; i++) {
				p.setCard(deck.setRandomCard());
			}
			
		}
	}
	
}

	
	
