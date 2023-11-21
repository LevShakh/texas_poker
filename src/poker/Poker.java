package poker;

import java.util.LinkedList;

public class Poker {
	
	private final byte TABLE_CARDS = 5;
	private final byte PLAYER_HAND = 2;
	
	public void play(LinkedList<Entity> players) {
		
		Cards deck = new Cards();
		
		Table table = new Table();
		
		giveCard(players, deck);
		
		for(int i = 0; i < TABLE_CARDS; i++) {
			table.setCard(deck.setRandomCard());
		}
		
		System.out.println("TABLE:");
		table.getCards();
		
		for(Entity p : players) {
			Resulter res = new Resulter(p, table);
			
			System.out.println("\nPlayer " + (players.indexOf(p) + 1) + ":");
			p.getCards();
			
			System.out.println(res.getCombs() + "\n");
		}
	}
	
	private void giveCard(LinkedList<? extends Entity> players, Cards deck) {
		for(Entity p : players) {
			for(int i = 0; i < PLAYER_HAND; i++) {
				p.setCard(deck.setRandomCard());
			}
			
		}
	}
	
//	private void giveCard(List<? extends Entity> players, Cards deck) {
//	for(Entity p : players) {
//		for(int i = 0; i < PLAYER_HAND; i++) {
//			p.setCard(deck.setRandomCard());
//		}
//		
//	}
//}
	
	public Poker() {

	}

	}

	
	
