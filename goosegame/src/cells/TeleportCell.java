package cells;

public class TeleportCell extends NormalCell {
	
	private int dest;

	public TeleportCell(int index, int dest) {
		super(index);
		this.dest = dest;
	}
	
	@Override
	public int handleMove(int diceThrow) {
		return dest;
	}
	
}
