import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import game.GamePlayer;
import sequences.GamePlayerCircle;

public class GameCircleTest {
	
	@Test
	public void testForNullList() {
		List<GamePlayer> nullList = null;
		
		GamePlayerCircle circle = new GamePlayerCircle(nullList);
		assertNotNull(circle.getAll().size());
		assertEquals(0, circle.getAll().size());
	}
	
	@Test
	public void testForEmpty() {
		List<GamePlayer> emptyList = new ArrayList<GamePlayer>();
		
		GamePlayerCircle circle = new GamePlayerCircle(emptyList);
		assertNotNull(circle.getAll());
		assertEquals(0, circle.getAll().size());
	}
	
	@Test
	public void testForListOfTwoPlayer() {
		List<GamePlayer> listOfTwo = new ArrayList<GamePlayer>();
		
		GamePlayer name1 = new GamePlayer("1");
		listOfTwo.add(name1);
		GamePlayer name2 = new GamePlayer("2");
		listOfTwo.add(name2);
		
		GamePlayerCircle circle = new GamePlayerCircle(listOfTwo);
		assertNotNull(circle.getAll());
		assertEquals(2, circle.getAll().size());
		
		assertEquals(name1, circle.getAll().get(0).getMyself());
		assertEquals(name2, circle.getAll().get(1).getMyself());
	}
	
	@Test
	public void testForListOfTwoPlayerStartingWiithSecond() {
		List<GamePlayer> listOfTwo = new ArrayList<GamePlayer>();
		
		GamePlayer name1 = new GamePlayer("1");
		listOfTwo.add(name1);
		GamePlayer name2 = new GamePlayer("2");
		listOfTwo.add(name2);
		
		GamePlayerCircle circle = new GamePlayerCircle(listOfTwo, name2);
		assertNotNull(circle.getAll());
		assertEquals(2, circle.getAll().size());
		
		assertEquals(name2, circle.getAll().get(0).getMyself());
		assertEquals(name1, circle.getAll().get(1).getMyself());
	}
	
	@Test
	public void testForListOfThreePlayer() {
		List<GamePlayer> listOfTwo = new ArrayList<GamePlayer>();
		
		GamePlayer name1 = new GamePlayer("1");
		listOfTwo.add(name1);
		GamePlayer name2 = new GamePlayer("2");
		listOfTwo.add(name2);
		GamePlayer name3 = new GamePlayer("3");
		listOfTwo.add(name3);
		
		GamePlayerCircle circle = new GamePlayerCircle(listOfTwo);
		assertNotNull(circle.getAll());
		assertEquals(3, circle.getAll().size());
		
		assertEquals(name1, circle.getAll().get(0).getMyself());
		assertEquals(name2, circle.getAll().get(1).getMyself());
		assertEquals(name3, circle.getAll().get(2).getMyself());
		
		

		assertEquals(circle.getAll().get(2), circle.getAll().get(0).getOnLefGamePlayer());
		
		assertEquals(circle.getAll().get(0), circle.getAll().get(2).getOnRighGamePlayer());
	}
	
	@Test
	public void testForListOfThreePlayerStartingWithSecond() {
		List<GamePlayer> listOfTwo = new ArrayList<GamePlayer>();
		
		GamePlayer name1 = new GamePlayer("1");
		listOfTwo.add(name1);
		GamePlayer name2 = new GamePlayer("2");
		listOfTwo.add(name2);
		GamePlayer name3 = new GamePlayer("3");
		listOfTwo.add(name3);
		
		GamePlayerCircle circle = new GamePlayerCircle(listOfTwo, name2);
		assertNotNull(circle.getAll());
		assertEquals(3, circle.getAll().size());
		
		assertEquals(name2, circle.getAll().get(0).getMyself());
		assertEquals(name3, circle.getAll().get(1).getMyself());
		assertEquals(name1, circle.getAll().get(2).getMyself());
		
		assertEquals(circle.getAll().get(2), circle.getAll().get(0).getOnLefGamePlayer());
		assertEquals(circle.getAll().get(0), circle.getAll().get(2).getOnRighGamePlayer());
	}

}
