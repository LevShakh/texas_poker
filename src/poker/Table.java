package poker;

public class Table extends Entity {

	private byte inhands = 0;
	
	private String[] cards = new String[5];
	
	public Table() {
//		cards[0] = Poker.setRandomCard();
//		cards[1] = Poker.setRandomCard();
//		cards[2] = Poker.setRandomCard();
//		cards[3] = Poker.setRandomCard();
//		cards[4] = Poker.setRandomCard();
	}
	
	public void getCards() {
		
		for(int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + "   ");
		}
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
}
