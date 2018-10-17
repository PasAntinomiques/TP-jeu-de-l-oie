package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cells.StartCell;
import cells.TrapCell;
import cells.WaitCell;
import goosegame.Player;

public class WaitCellTest {

	@Test
	public void testCanBeLeft() {
		WaitCell c = new WaitCell(1,1);
		assertTrue(! c.canBeLeft());
		c.nextTurn();
		assertTrue(c.canBeLeft());
	}

	@Test
	public void testWelcomePlayer() {
		Player p = new Player("name");
		StartCell c0 = new StartCell(0);
		WaitCell c1 = new WaitCell(1,1);
		c0.welcomePlayer(p);
		c1.welcomePlayer(p);
		assertTrue(p.getCell() == c1);
		assertTrue(c1.getPlayer() == p);
		assertTrue(c0.getPlayer() == null);
	}


	@Test
	public void testHandleMove() {
		WaitCell c = new WaitCell(4,2);
		assertTrue(4 == c.handleMove(8));
	}

	@Test
	public void testIsBusy() {
		WaitCell c = new WaitCell(1,1);
		assertTrue(! c.isBusy());
		Player p = new Player("name");
		c.welcomePlayer(p);
		assertTrue(c.isBusy());
	}

}
