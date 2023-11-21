package poker;

import java.util.ArrayList;

public class Entity {
	
	ArrayList<String> cards = new ArrayList<String>();
	
	byte cardnum;
	
	byte inhands = 0;
	
	public Entity() {
		this.cardnum = 0;
	}
	
	public void getCards() {
		
		for(String card:cards) {
			System.out.print(card + "   ");
		}
		System.out.print("\n");
		
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
	}
	
	public void iam() {
		System.out.println("I AM ENTITY");
	}
	
}
