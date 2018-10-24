package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cells.BigCell;
import cells.NormalCell;
import cells.StartCell;
import cells.WaitCell;
import goosegame.Player;

public class BigCellTest {

	/**
	 * test if the wait cell can be left
	 */
	@Test
	public void testCanBeLeft() {
		BigCell c = new BigCell(7,2);
		assertTrue(c.canBeLeft());
	}

	/**
	 * test if the when the player arrives on a cell (even when there is already a player in it)
	 */
	@Test
	public void testWelcomePlayer() {
		Player p1 = new Player("name1");
		Player p2 = new Player("name2");
		NormalCell c0 = new NormalCell(0);
		NormalCell c1 = new NormalCell(0);
		BigCell c2 = new BigCell(7,2);
		c0.welcomePlayer(p1);
		c1.welcomePlayer(p2);
		c2.welcomePlayer(p1);
		c2.welcomePlayer(p2);
		
		assertTrue(p1.getCell() == c2);
		assertTrue(p2.getCell() == c2);
		assertTrue(c2.getPlayers().contains(p1));
		assertTrue(c2.getPlayers().contains(p2));
		assertTrue(c1.getPlayers().size() == 0);
		assertTrue(c0.getPlayers().size() == 0);
	}


	/**
	 * verify that you can move
	 */
	@Test
	public void testHandleMove() {
		BigCell c1 = new BigCell(7,2);
		assertTrue(7 == c1.handleMove(8));
	}

	/**
	 * verify that when a player is on a cell the cell is busy
	 */
	@Test
	public void testIsBusy() {
		BigCell c = new BigCell(7,2);
		assertTrue(! c.isBusy());
		Player p1 = new Player("name");
		c.welcomePlayer(p1);
		assertTrue( ! c.isBusy());
		
		Player p2 = new Player("name");
		c.welcomePlayer(p2);
		assertTrue( c.isBusy());
	}

}
