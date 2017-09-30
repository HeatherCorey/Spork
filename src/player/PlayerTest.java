package player;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testplayerDeath() {
		
		Warrior a = new Warrior("James");
		a.currentHP -= 1500;
		assertTrue("Problem determining player's HP", a.getCurrentHP() == -1400);
		assertTrue("Problem setting isDefeated to 'true' in playerDeath", a.playerDeath() == true);
	}
	
	@Test
	public void testMovePlayer() {
		
		Map newMap = new Map();
		newMap.populateMap();
		
		Warrior a = new Warrior("James");
		
		assertTrue("Trouble setting x coordinates in constructor", a.getX() == 5);
		assertTrue("Trouble setting y coordinates in constructor", a.getY() == 5);
		a.movePlayer(0);
		assertTrue("Trouble setting new y coordinates when moving North in movePlayer()", a.getY() == 6);
		a.movePlayer(1);
		assertTrue("Trouble setting new x coordinates when moving East in movePlayer()", a.getX() == 6);
		a.movePlayer(2);
		assertTrue("Trouble setting new y coordinates when moving South in movePlayer()", a.getY() == 5);
		a.movePlayer(3);
		assertTrue("Trouble setting new x coordinates when moving West in movePlayer()", a.getX() == 5);
		a.movePlayer(1);
		a.movePlayer(1);
		a.movePlayer(1);
		assertTrue("Move should be allowed",a.movePlayer(1));
		System.out.println(a.getX());
		assertTrue("Move should be forbidden due to exceeding map size", a.movePlayer(1) == false);
		System.out.println(a.getX());
	}
	
	@Test
	public void testExecuteAttack() {
		
	}
}
