package cells;

public class TrapCell extends NormalCell {

	public TrapCell(int index) {
		super(index);
	}
	
	@Override
	public boolean canBeLeft() {
		return false;
	}
}
