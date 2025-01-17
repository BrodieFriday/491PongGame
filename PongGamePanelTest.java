package pong;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PongGamePanelTest {

	
	
	@Test
	public void redPowerUpIdEquals1() {
		var redPowerUp = new PongGamePanel();
		assertTrue(redPowerUp.redPowerUp.powerUpId==1);
	}
	
	@Test
	public void pinkPowerUpIdEquals2() {
		var pinkPowerUpId = new PongGamePanel();
		assertTrue(pinkPowerUpId.pinkPowerUp.powerUpId==2);
	}
	
	@Test
	public void paddleOneIdEquals1() {
		var paddle1 = new PongGamePanel();
		assertTrue(paddle1.paddle1.paddleID==1);
	}
	
	@Test
	public void paddleTwoIdEquals2() {
		var paddle2 = new PongGamePanel();
		assertTrue(paddle2.paddle2.paddleID==2);
	}
	
	@Test
	public void fieldWidthEquals1000() {
		var width = new PongGamePanel();
		assertTrue(width.FIELD_WIDTH==1000);
	}
	
	@Test
	public void fieldHeightEquals500() {
		var width = new PongGamePanel();
		assertTrue(width.FIELD_HEIGHT==500);
	}
	
	@Test
	public void ballSizeEquals20() {
		var width = new PongGamePanel();
		assertTrue(width.BALL_SIZE==20);
	}
	
}
