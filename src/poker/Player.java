package poker;

public class Player extends Entity {

	private byte cardnum = 2;
	
	/**
	 * This constructor sets Player's max card quantity (cardnum) to superclass Entity
	 */
	public Player() {
		super.cardnum = this.cardnum;
	}
	
	/**
	 * EDUCATIONAL METHOD
	 */
	public void iam() {
		System.out.println("I AM PLAYER");
	}
}
