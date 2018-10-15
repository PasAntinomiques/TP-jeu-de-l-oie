package cells;

import goosegame.Player;

public class WaitCell extends NormalCell {
	
	/**
	 * Number of turn to wait 
	 */
	private int timeToWait;
	
	/**
	 * Number of turn already waited
	 */
	private int timer;
	
	/**
	 * @param index the index of the cell
	 */
	public WaitCell(int index,int timeToWait) {
		super(index);
		this.timeToWait = timeToWait;
		this.timer = 0;
	}
	
	/* (non-Javadoc)
	 * @see cells.NormalCell#welcomePlayer(goosegame.Player)
	 */
	@Override
	public void welcomePlayer(Player newPlayer) {
		super.welcomePlayer(newPlayer);
		this.timer = 0;
	}
	
	/* (non-Javadoc)
	 * @see cells.NormalCell#canBeLeft()
	 */
	@Override
	public boolean canBeLeft() {
		return this.timer > this.timeToWait;
	}
	
	@Override
	public void nextTurn() {	
		this.timer += 1;
	}

}
