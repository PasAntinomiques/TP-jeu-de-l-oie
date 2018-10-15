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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int handleMove(int diceThrow) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBusy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void welcomePlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
