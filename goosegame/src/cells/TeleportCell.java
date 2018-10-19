package cells;

public class TeleportCell extends NormalCell {
	
	private int dest;

	/**
	 * @param index the position of the teleportcell on the board
	 * @param dest the destination of the player when he land on it
	 */
	public TeleportCell(int index, int dest) {
		super(index);
		this.dest = dest;
	}
	
	/* (non-Javadoc)
	 * @see cells.NormalCell#handleMove(int)
	 */
	@Override
	public int handleMove(int diceThrow) {
		return dest;
	}
	
}
