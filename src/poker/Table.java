package poker;

public class Table extends Entity {

	private byte cardnum = 5;
	
	/**
	 * Sets table's max cards to superclass Entity
	 */
	public Table() {
		super.cardnum = this.cardnum;
	}

}
