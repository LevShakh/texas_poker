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
	
	public void getCards() {
		
		for(String card:cards) {
			System.out.print(card + "   ");
		}
		System.out.print("\n");
		
	}
	
	public List<String> getCardsList() {
		return this.cards;
	}
	
	public String getCard(int i) {
		return cards.get(i);
	}
	
	public void setCard(String card) {
		if(inhands < cardnum) {
			cards.add(inhands, card);
			inhands++;
		}
	}
	
	public void nullHand() {
		this.inhands = 0;
		cards.clear();
	}
	
	public void iam() {
		System.out.println("I AM ENTITY");
	}
	
}
