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
  public void testPlaceValid() {
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
  @Test	
  public void testPlaceOutofBounds() {
      Board board = new Board();
      assertFalse(board.Place(3,0,1));
      assertFalse(board.Place(0,3,1));
      assertFalse(board.Place(-1,0,1));
      assertFalse(board.Place(0,-1,1));
      assertFalse(board.Place(3,3,1));
      assertFalse(board.Place(-1,3,1));
      assertFalse(board.Place(3,-1,1));
      assertEquals(board.GetBoard(),"000000000");
  } 

  @Test	
  public void testNoWinner() {
      Board board = new Board();
      assertEquals(board.GetWinner(),0);
      board.Place(0,0,1);
      board.Place(0,1,2);
      board.Place(0,2,1);
      assertEquals(board.GetWinner(),0); 
      board.Place(1,0,2);
      board.Place(1,1,1);
      board.Place(1,2,2);
      assertEquals(board.GetWinner(),0); 
      board.Place(2,0,2);
      board.Place(2,1,1);
      board.Place(2,2,2);
      assertEquals(board.GetWinner(),0);
  }
   

  @Test	
  public void testWinner() {
      Board board = new Board();
      board.Place(0,0,1);
      board.Place(0,1,1);
      board.Place(0,2,1);
      assertEquals(board.GetWinner(),1); 
      board.Place(1,0,2);
      board.Place(2,1,2);
      board.Place(1,2,2);
      assertEquals(board.GetWinner(),1); 
      
      board = new Board();
      board.Place(0,0,2);
      board.Place(0,1,2);
      board.Place(0,2,2);
      assertEquals(board.GetWinner(),2); 
      board.Place(1,0,1);
      board.Place(2,1,1);
      board.Place(1,2,1);
      assertEquals(board.GetWinner(),2);
      
      board = new Board();
      board.Place(0,0,1);
      board.Place(0,1,2);
      board.Place(0,2,1);
      assertEquals(board.GetWinner(),0); 
      board.Place(1,0,2);
      board.Place(1,1,1);
      board.Place(1,2,2);
      assertEquals(board.GetWinner(),0); 
      board.Place(2,0,1);
      assertEquals(board.GetWinner(),1); 
  }
   
}
