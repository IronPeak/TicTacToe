package is.teamgoomba.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

  @Test	
  public void testEmptyBoard() {
      Board board = new Board();
      assertEquals(board.GetBoard(),"000000000");
  }
 
  @Test	
  public void testPlaceValidBoard() {
      Board board = new Board();
      assertTrue(board.Place(0,0,1));
      assertTrue(board.Place(2,2,2));
      assertTrue(board.Place(1,1,1));
      assertTrue(board.Place(1,2,2));
      assertTrue(board.Place(0,1,1));
      assertTrue(board.Place(2,1,2));
      assertTrue(board.Place(0,2,1));
      assertEquals(board.GetBoard(),"100112122");
  }
   
}
