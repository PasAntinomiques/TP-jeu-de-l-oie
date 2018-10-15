package cells;

import goosegame.Player;

public class NormalCell implements Cell {
	protected Player player;
	protected int index;
	
	public NormalCell(int i) {
		this.index = i;
	}

	@Override
	public boolean canBeLeft() {
		return false;
	}

	@Override
	public int getIndex() {
		return 0;
	}

	@Override
	public int handleMove(int diceThrow) {
		return 0;
	}

	@Override
	public boolean isBusy() {
		return false;
	}

	@Override
	public void welcomePlayer(Player player) {
		
	}

	@Override
	public Player getPlayer() {
		return null;
	}
	

}
