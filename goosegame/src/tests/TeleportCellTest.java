package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cells.StartCell;
import cells.TeleportCell;
import goosegame.Player;

public class TeleportCellTest {

	@Test
	public void testHandleMove() {
		TeleportCell c = new TeleportCell(4,12);
		assertTrue(12 == c.handleMove(8));
	}

	@Test
	public void testCanBeLeft() {
		TeleportCell c = new TeleportCell(1,10);
		assertTrue(c.canBeLeft());
	}

	@Test
	public void testIsBusy() {
		TeleportCell c = new TeleportCell(1,10);
		assertTrue(! c.isBusy());
		Player p = new Player("name");
		c.welcomePlayer(p);
		assertTrue(c.isBusy());
	}

	@Test
	public void testWelcomePlayer() {
		Player p = new Player("name");
		StartCell c0 = new StartCell(0);
		TeleportCell c1 = new TeleportCell(1,10);
		c0.welcomePlayer(p);
		c1.welcomePlayer(p);
		assertTrue(p.getCell() == c1);
		assertTrue(c1.getPlayers().contains(p));
		assertTrue(c0.getPlayers().size() == 0);
	}

	@Test
	public void testLeave() {
		Player p = new Player("name");
		TeleportCell c = new TeleportCell(0,10);
		p = new Player("name");
		c.welcomePlayer(p);
		assertTrue(c.getPlayers().contains(p));
		c.leave(p);
		assertTrue(c.getPlayers().size() == 0);
	}

}
