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
	public WaitCell(int index) {
		super(index);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see cells.NormalCell#welcomePlayer(goosegame.Player)
	 */
	@Override
	public void welcomePlayer(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	/* (non-Javadoc)
	 * @see cells.NormalCell#canBeLeft()
	 */
	@Override
	public boolean canBeLeft() {
		return false;
	}

}
