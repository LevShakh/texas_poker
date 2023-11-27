package poker;

import java.util.List;
import java.util.ArrayList;

public class Entity {
	
	private List<String> cards = new ArrayList<String>();
	
	protected byte cardnum;
	
	protected byte inhands = 0;
	
	public Entity() {
		this.cardnum = 0;
	}
	
	/**
	 * Prints cards of entity (either player or table)
	 */
	public void getCards() {
		
		for(String card:cards) {
			System.out.print(card + "   ");
		}
		System.out.print("\n");
		
	}
	
	/**
	 * Returns List of cards
	 * @return List of cards
	 */
	public List<String> getCardsList() {
		return this.cards;
	}
	
	/**
	 * Returns card by index i
	 * @param i index of card to be gotten
	 * @return card with index of i
	 */
	public String getCard(int i) {
		return cards.get(i);
	}
	
	/**
	 * Sets card to entity.
	 * @param card String card
	 */
	public void setCard(String card) {
		if(inhands < cardnum) {
			cards.add(inhands, card);
			inhands++;
		}
	}
	
	/**
	 * Clears hand of entity
	 */
	public void nullHand() {
		this.inhands = 0;
		cards.clear();
	}
	
	/**
	 * EDUCATIONAL PURPOSES
	 */
	public void iam() {
		System.out.println("I AM ENTITY");
	}
	
}
