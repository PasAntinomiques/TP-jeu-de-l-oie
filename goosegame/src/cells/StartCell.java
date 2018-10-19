package cells;

import goosegame.Player;

public class StartCell implements Cell {
	
	private int index;
	
	/**
	 * @param index the index of the start cell (can be != from 0?)
	 */
	public StartCell(int index) {
		this.index = index;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#canBeLeft()
	 */
	@Override
	public boolean canBeLeft() {
		return true;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#getIndex()
	 */
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

	/* (non-Javadoc)
	 * @see cells.Cell#handleMove(int)
	 */
	@Override
	public int handleMove(int diceThrow) {
		return this.index;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#isBusy()
	 */
	@Override
	public boolean isBusy() {
		return false;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#welcomePlayer(goosegame.Player)
	 */
	@Override
	public void welcomePlayer(Player player) {
		if(player.getCell()!=null)
			player.getCell().leave(player);
		player.setCell(this);
	}

	/* (non-Javadoc)
	 * @see cells.Cell#getPlayer()
	 */
	@Override
	public Player getPlayer() {
		return null;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#leave(goosegame.Player)
	 */
	@Override
	public void leave(Player player) {
		
	}

	/* (non-Javadoc)
	 * @see cells.Cell#nextTurn()
	 */
	@Override
	public void nextTurn() {
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.getClass().getSimpleName() + "("+this.getIndex()+")";
	}

}
