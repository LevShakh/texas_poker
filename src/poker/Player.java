package poker;

public class Player extends Entity {
	
	private byte inhands = 0;
	private byte cardnum = 2;
	
	private String[] cards = new String[2];
	
	public Player() {
		super.cardnum = this.cardnum;
	}
	
	protected byte getInHandsToParent() {
		return this.inhands;
	}
	
	protected String[] getCardsToParent() {
		return this.cards;
	}
	
	protected byte getCardNumToParent() {
		return this.cardnum;
	}
	
	public void iam() {
		System.out.println("I AM PLAYER");
	}
}
