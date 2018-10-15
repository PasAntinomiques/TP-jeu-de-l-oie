package cells;

public class TeleportPlayer extends NormalCell {
	
	private int dest;

	public TeleportPlayer(int index, int dest) {
		super(index);
		this.dest = dest;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int handleMove(int diceThrow) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
