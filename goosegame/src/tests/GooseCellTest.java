package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cells.GooseCell;
import cells.StartCell;
import goosegame.Player;

public class GooseCellTest {

	@Test
	public void testCanBeLeft() {
		GooseCell c = new GooseCell(1);
		assertTrue(c.canBeLeft());
	}

	@Test
	public void testGetIndex() {
		GooseCell c = new GooseCell(1);
		assertTrue(c.getIndex() == 1);
	}

	@Test
	public void testIsBusy() {
		GooseCell c = new GooseCell(1);
		Player p = new Player("name");
		assertTrue(! c.isBusy());
		c.welcomePlayer(p);
		assertTrue(c.isBusy());
	}

	@Test
	public void testWelcomePlayer() {
		Player p = new Player("name");
		StartCell c0 = new StartCell(0);
		GooseCell c1 = new GooseCell(1);
		c0.welcomePlayer(p);
		c1.welcomePlayer(p);
		assertTrue(p.getCell() == c1);
		assertTrue(c1.getPlayers().contains(p));
		assertTrue(c0.getPlayers().size() == 0);
	}

	@Test
	public void testLeave() {
		Player p = new Player("name");
		GooseCell c = new GooseCell(0);
		p = new Player("name");
		c.welcomePlayer(p);
		assertTrue(c.getPlayers().contains(p));
		c.leave(p);
		assertTrue(c.getPlayers().size() == 0);
	}
	
	@Test
	public void testHandleMove() {
		GooseCell c = new GooseCell(4);
		assertTrue(4 + 8 == c.handleMove(8));
	}

}
