package poker;

public class Player extends Entity {

	private int money = 0;
	
	private byte cardnum = 2;
	
	/**
	 * This constructor sets Player's max card quantity (cardnum) to superclass Entity
	 */
	public Player() {
		super.cardnum = this.cardnum;
		this.money = 1000;
	}
	
	
	
	
}
