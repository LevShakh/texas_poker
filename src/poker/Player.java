package poker;

public class Player extends Entity {
	
	private byte inhands = 0;
	
	private String[] cards = new String[2];
	
	public Player() {
//		cards[0] = Poker.setRandomCard();
//		cards[1] = Poker.setRandomCard();
	}
	
	byte getInHandsFromChild() {
		return inhands;
	}
	
	String[] getCardsFromChild() {
		return cards;
	}
	
	public void getCards() {
		
		for(int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + "   ");
		}
		System.out.print("\n");
		
	}
	
	public String getCard(int i) {
		return cards[i];
	}
	
	public void setCard(String card) {
		if(inhands < 5) {
			cards[inhands] = card;
			inhands++;
		}
	}
	
	public void nullHand() {
		this.inhands = 0;
	}
}
