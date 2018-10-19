package cells;

public class GooseCell extends NormalCell {

	/**
	 * @param i create a cell winth and index i
	 */
	public GooseCell(int i) {
		super(i);
	}
	
	/* (non-Javadoc)
	 * @see cells.NormalCell#handleMove(int)
	 */
	@Override
	public int handleMove(int diceThrow) {
		return this.index + diceThrow;
	}
}
