package cells;

public class TrapCell extends NormalCell {

	/**
	 * @param index the position of the trapcell
	 */
	public TrapCell(int index) {
		super(index);
	}
	
	@Override
	public boolean canBeLeft() {
		return false;
	}
}
