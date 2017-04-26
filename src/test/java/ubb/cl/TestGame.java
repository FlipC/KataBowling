package ubb.cl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGame {
	
	private Game g = new Game();
	
	@Test
	public void roll3And5Return8(){
		int result;
		g.roll(3);
		g.roll(5);
		
		result=g.score();
		
		assertEquals(8,result);
	}
	
	@Test 
	public void roll7And2Return17(){
		int result;
		g.roll(3);
		g.roll(5);
		g.roll(7);
		g.roll(2);
				
		result=g.score();
		
		assertEquals(17,result);
	}
}

