package cells;

import goosegame.Player;

public class StartCell implements Cell {
	
	private int index;
	
	public StartCell(int index) {
		this.index = index;
	}

	@Override
	public boolean canBeLeft() {
		return true;
	}

	@Override
	public int getIndex() {
		return this.index;
	}
	
	/**
	 * @param index the start cell index can be different from 0
	 * for now we are not implementing that kind of game
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public int handleMove(int diceThrow) {
		return this.index;
	}

	@Override
	public boolean isBusy() {
		return false;
	}

	@Override
	public void welcomePlayer(Player player) {
		player.setCell(this);
	}

	@Override
	public Player getPlayer() {
		return null;
	}

	@Override
	public void leave(Player player) {
		
	}

	@Override
	public void nextTurn() {
		
	}

}
