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
	
	@Test
	public void roll0And0Return17(){
		int result;
		g.roll(3);
		g.roll(5);
		g.roll(7);
		g.roll(2);
		g.roll(0);
		g.roll(0);
		
		result=g.score();
		
		assertEquals(17,result);
	}
	
	@Test
	public void spare(){
		int result;
		g.roll(3);
		g.roll(5);
		g.roll(7);
		g.roll(2);
		g.roll(0);
		g.roll(0);
		g.roll(5);
		g.roll(5);
		
		result = g.score();
		
		assertEquals(27,result);
	}
}

