package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cells.NormalCell;
import cells.StartCell;
import goosegame.Player;

public class StartCellTest {


	@Test
	public void testIsBusy() {
		StartCell c = new StartCell(0);
		assertTrue(! c.isBusy());
	}

	@Test
	public void testWelcomePlayer() {
		Player p = new Player("name");
		StartCell c = new StartCell(0);
		NormalCell cn = new NormalCell(1);
		cn.welcomePlayer(p);
		c.welcomePlayer(p);
		assertTrue(p.getCell() == c);
		//assertTrue(c.getPlayer() == p); we don't care about that at all
		assertTrue(cn.getPlayers().size() == 0);
	}


}
