package is.teamgoomba.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

  @Test 
  public void testGetBoard() {
      Game game = new Game();
      assertEquals(game.getBoard(),"000000000");
  }
  @Test 
  public void testMoveAllSquares(){
      Game game = new Game();
      assertTrue(game.move(0));
      assertTrue(game.move(1));
      assertTrue(game.move(2));
      assertTrue(game.move(3));
      assertTrue(game.move(4));
      assertTrue(game.move(5));
      assertTrue(game.move(6));
      assertTrue(game.move(7));
      assertTrue(game.move(8));
      assertEquals(game.getBoard(),"121212121");
  }

  @Test 
  public void testInvalidMove(){ 
      Game game = new Game();
      assertTrue(game.move(0));
      assertFalse(game.move(0)); 
      assertTrue(game.move(1));
      assertFalse(game.move(1));
      assertTrue(game.move(2));
      assertFalse(game.move(2));
      assertTrue(game.move(3));
      assertFalse(game.move(0));
      assertEquals(game.getBoard(),"121200000");
  } 
  @Test 
  public void testMoveOutOfBounds(){ 
      Game game = new Game();
      assertFalse(game.move(-1)); 
      assertFalse(game.move(9));
      assertFalse(game.move(23123));
      assertFalse(game.move(-2222));
      assertTrue(game.move(3));
      assertEquals(game.getBoard(),"000100000");
  }  

  @Test	
  public void testGameOver(){ 
      Game game = new Game();
      assertTrue(game.move(0)); 
      assertTrue(game.move(3));
      assertTrue(game.move(1));
      assertTrue(game.move(4));
      assertFalse(game.gameOver());
      assertTrue(game.move(2));
      assertTrue(game.gameOver()); 

      game = new Game();
      assertTrue(game.move(1)); 
      assertTrue(game.move(0));
      assertTrue(game.move(2));
      assertTrue(game.move(4));
      assertFalse(game.gameOver());
      assertTrue(game.move(6));
      assertFalse(game.gameOver());
      assertTrue(game.move(8));
      assertTrue(game.gameOver());
  }

  @Test	
  public void testGetWinner(){ 
      Game game = new Game();
      assertTrue(game.move(0)); 
      assertTrue(game.move(3));
      assertTrue(game.move(1));
      assertTrue(game.move(4));
      assertTrue(game.move(2));
      assertEquals(game.getWinner(),1); 

      game = new Game();
      assertTrue(game.move(1)); 
      assertTrue(game.move(0));
      assertTrue(game.move(2));
      assertTrue(game.move(4));
      assertTrue(game.move(6));
      assertTrue(game.move(8));
      assertEquals(game.getWinner(),2);
  }
  
  @Test	
  public void testRestart(){ 
      Game game = new Game();
      game.move(0); 
      game.move(3);
      game.move(1);
      game.move(4);
      game.move(2);
      game.restart();
      assertEquals(game.getBoard(),"000000000");
      assertEquals(game.getPlayer(),2);
      game.restart();
      assertEquals(game.getPlayer(),1); 
  }
  
}
