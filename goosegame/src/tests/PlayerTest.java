package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cells.NormalCell;
import goosegame.Player;

public class PlayerTest {
	protected Player p;

	@Before
	public void setUp() throws Exception {
		p = new Player("name");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		assertEquals("name",p.toString());
	}

	@Test
	public void testCell() {
		NormalCell c = new NormalCell(0);
		p.setCell(c);
		assertEquals(c,p.getCell());
	}

	@Test
	public void testTwoDiceThrow() {
		int d = p.twoDiceThrow();
		assertTrue(d <= 12 && d >= 1);
	}

}
