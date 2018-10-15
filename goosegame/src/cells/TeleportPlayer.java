package cells;

public class TeleportPlayer extends NormalCell {
	
	private int dest;

	public TeleportPlayer(int index, int dest) {
		super(index);
		this.dest = dest;
	}
	
	@Override
	public int handleMove(int diceThrow) {
		return dest;
	}
	
}
