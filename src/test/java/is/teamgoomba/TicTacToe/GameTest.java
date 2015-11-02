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
      assertTrue(game.Move(0,1));
      assertTrue(game.Move(1,2));
      assertTrue(game.Move(2,1));
      assertTrue(game.Move(3,2));
      assertTrue(game.Move(4,1));
      assertTrue(game.Move(5,2));
      assertTrue(game.Move(6,1));
      assertTrue(game.Move(7,2));
      assertTrue(game.Move(8,1));
      assertEquals(game.GetBoard(),"121212121");
  }

  @Test	
  public void testInvalidMove(){ 
      Game game = new Game();
      assertTrue(game.Move(0,1));
      assertFalse(game.Move(0,2)); 
      assertTrue(game.Move(1,2));
      assertFalse(game.Move(1,1));
      assertTrue(game.Move(2,1));
      assertFalse(game.Move(2,2));
      assertTrue(game.Move(3,2));
      assertFalse(game.Move(0,1));
      assertEquals(game.GetBoard(),"121200000");
  } 
  @Test	
  public void testMoveOutOfBounds(){ 
      Game game = new Game();
      assertFalse(game.Move(-1,1)); 
      assertFalse(game.Move(9,2));
      assertFalse(game.Move(23123,1));
      assertFalse(game.Move(-2222,2));
      assertTrue(game.Move(3,1));
      assertEquals(game.GetBoard(),"000100000");
  }  
}
