package cells;

public class GooseCell extends NormalCell {

	public GooseCell(int i) {
		super(i);
	}
	
	@Override
	public int handleMove(int diceThrow) {
		return this.index + diceThrow;
	}
}
