package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cells.StartCell;
import cells.WaitCell;
import goosegame.Player;

public class WaitCellTest {

	/**
	 * test if the wait cell can be left
	 */
	@Test
	public void testCanBeLeft() {
		WaitCell c = new WaitCell(1,1);
		assertTrue(! c.canBeLeft());
		c.nextTurn();
		assertTrue(c.canBeLeft());
	}

	/**
	 * test if the when the player arrives on a cell (even when there is already a player in it)
	 */
	@Test
	public void testWelcomePlayer() {
		Player p = new Player("name");
		StartCell c0 = new StartCell(0);
		WaitCell c1 = new WaitCell(1,1);
		c0.welcomePlayer(p);
		c1.welcomePlayer(p);
		assertTrue(p.getCell() == c1);
		assertTrue(c1.getPlayers().contains(p));
		assertTrue(c0.getPlayers().size() == 0);
	}


	/**
	 * verify that you can move
	 */
	@Test
	public void testHandleMove() {
		WaitCell c = new WaitCell(4,2);
		assertTrue(4 == c.handleMove(8));
	}

	/**
	 * verify that when a player is on a cell the cell is busy
	 */
	@Test
	public void testIsBusy() {
		WaitCell c = new WaitCell(1,1);
		assertTrue(! c.isBusy());
		Player p = new Player("name");
		c.welcomePlayer(p);
		assertTrue(c.isBusy());
	}

}
