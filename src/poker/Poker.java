package poker;

import java.util.LinkedList;

public class Poker {
	
	public void play(LinkedList<Entity> players) {
		
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
	
	private void giveCard(LinkedList<Entity> players, Cards deck) {
		for(Entity p : players) {
			for(int i = 0; i < p.cardnum; i++) {
				p.setCard(deck.setRandomCard());
			}
			
		}
	}
	
}

	
	
