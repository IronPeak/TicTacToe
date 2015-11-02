package is.teamgoomba.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

  @Test 
  public void testGetBoard() {
      Game game = new Game();
      assertEquals(game.GetBoard(),"000000000");
  }
  @Test 
  public void testMoveAllSquares(){
      Game game = new Game();
      assertTrue(game.Move(0));
      assertTrue(game.Move(1));
      assertTrue(game.Move(2));
      assertTrue(game.Move(3));
      assertTrue(game.Move(4));
      assertTrue(game.Move(5));
      assertTrue(game.Move(6));
      assertTrue(game.Move(7));
      assertTrue(game.Move(8));
      assertEquals(game.GetBoard(),"121212121");
  }

  @Test 
  public void testInvalidMove(){ 
      Game game = new Game();
      assertTrue(game.Move(0));
      assertFalse(game.Move(0)); 
      assertTrue(game.Move(1));
      assertFalse(game.Move(1));
      assertTrue(game.Move(2));
      assertFalse(game.Move(2));
      assertTrue(game.Move(3));
      assertFalse(game.Move(0));
      assertEquals(game.GetBoard(),"121200000");
  } 
  @Test 
  public void testMoveOutOfBounds(){ 
      Game game = new Game();
      assertFalse(game.Move(-1)); 
      assertFalse(game.Move(9));
      assertFalse(game.Move(23123));
      assertFalse(game.Move(-2222));
      assertTrue(game.Move(3));
      assertEquals(game.GetBoard(),"000100000");
  }  

  @Test	
  public void testGameOver(){ 
      Game game = new Game();
      assertTrue(game.Move(0)); 
      assertTrue(game.Move(3));
      assertTrue(game.Move(1));
      assertTrue(game.Move(4));
      assertFalse(game.GameOver());
      assertTrue(game.Move(2));
      assertTrue(game.GameOver()); 

      game = new Game();
      assertTrue(game.Move(1)); 
      assertTrue(game.Move(0));
      assertTrue(game.Move(2));
      assertTrue(game.Move(4));
      assertFalse(game.GameOver());
      assertTrue(game.Move(6));
      assertFalse(game.GameOver());
      assertTrue(game.Move(8));
      assertTrue(game.GameOver());
  }

  @Test	
  public void testGetWinner(){ 
      Game game = new Game();
      assertTrue(game.Move(0)); 
      assertTrue(game.Move(3));
      assertTrue(game.Move(1));
      assertTrue(game.Move(4));
      assertTrue(game.Move(2));
      assertEquals(game.GetWinner(),1); 

      game = new Game();
      assertTrue(game.Move(1)); 
      assertTrue(game.Move(0));
      assertTrue(game.Move(2));
      assertTrue(game.Move(4));
      assertTrue(game.Move(6));
      assertTrue(game.Move(8));
      assertEquals(game.GetWinner(),2);
  }
  
  @Test	
  public void testRestart(){ 
      Game game = new Game();
      game.Move(0); 
      game.Move(3);
      game.Move(1);
      game.Move(4);
      game.Move(2);
      game.restart();
      assertEquals(game.GetBoard(),"000000000"); 
  }
  
}
