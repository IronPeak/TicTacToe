package is.teamgoomba.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

  @Test	
  public void testEmptyBoard() {
      Board board = new Board();
      assertEquals(board.getBoard(),"000000000");
  }
 
  @Test	
  public void testPlaceValid() {
      Board board = new Board();
      assertTrue(board.place(0,0,1));
      assertTrue(board.place(2,2,2));
      assertTrue(board.place(1,1,1));
      assertTrue(board.place(1,2,2));
      assertTrue(board.place(0,1,1));
      assertTrue(board.place(2,1,2));
      assertTrue(board.place(0,2,1));
      assertEquals(board.getBoard(),"100112122");
  }

  @Test	
  public void testInvalidPlace() {
      Board board = new Board();
      assertTrue(board.place(0,0,1));
      assertFalse(board.place(0,0,1));
      assertFalse(board.place(0,0,2));
      assertEquals(board.getBoard(),"100000000");
      assertTrue(board.place(1,1,2));
      assertFalse(board.place(1,1,1));
      assertFalse(board.place(1,1,2));
  } 

  @Test	
  public void testPlaceOutofBounds() {
      Board board = new Board();
      assertFalse(board.place(3,0,1));
      assertFalse(board.place(0,3,1));
      assertFalse(board.place(-1,0,1));
      assertFalse(board.place(0,-1,1));
      assertFalse(board.place(3,3,1));
      assertFalse(board.place(-1,3,1));
      assertFalse(board.place(3,-1,1));
      assertEquals(board.getBoard(),"000000000");
  } 

  @Test	
  public void testNoWinner() {
      Board board = new Board();
      assertEquals(board.getWinner(),0);
      board.place(0,0,1);
      board.place(0,1,2);
      board.place(0,2,1);
      assertEquals(board.getWinner(),0); 
      board.place(1,0,2);
      board.place(1,1,1);
      board.place(1,2,2);
      assertEquals(board.getWinner(),0); 
      board.place(2,0,2);
      board.place(2,1,1);
      board.place(2,2,2);
      assertEquals(board.getWinner(),3);
  }
   
  @Test	
  public void testSlantedWinner() {
      Board board = new Board();
      board.place(0,0,1);
      board.place(1,1,1);
      board.place(2,2,1);
      assertEquals(board.getWinner(),1); 
      board = new Board();
      board.place(2,0,2);
      board.place(1,1,2);
      board.place(0,2,2);
      assertEquals(board.getWinner(),2);  
  }
  


  @Test	
  public void testVerticalWinner() {
      Board board = new Board();
      board.place(0,0,1);
      board.place(0,1,1);
      board.place(0,2,1);
      assertEquals(board.getWinner(),1); 
      board.place(1,0,2);
      board.place(2,1,2);
      board.place(1,2,2);
      assertEquals(board.getWinner(),1); 
      
      board = new Board();
      board.place(1,0,2);
      board.place(1,1,2);
      board.place(1,2,2);
      assertEquals(board.getWinner(),2); 
      board.place(0,0,1);
      board.place(2,1,1);
      board.place(0,2,1);
      assertEquals(board.getWinner(),2);
      
      board = new Board();
      board.place(2,0,2);
      board.place(2,1,2);
      board.place(2,2,2);
      assertEquals(board.getWinner(),2); 
      board.place(0,0,1);
      board.place(1,1,1);
      board.place(0,2,1);
      assertEquals(board.getWinner(),2);
  }
  
  @Test	
  public void testHorizontalWinner() {
      Board board = new Board();
      board.place(0,0,1);
      board.place(1,0,1);
      board.place(2,0,1);
      assertEquals(board.getWinner(),1); 
      board.place(1,0,2);
      board.place(2,1,2);
      board.place(1,2,2);
      assertEquals(board.getWinner(),1); 
      
      board = new Board();
      board.place(0,1,2);
      board.place(1,1,2);
      board.place(2,1,2);
      assertEquals(board.getWinner(),2); 
      board.place(0,0,1);
      board.place(2,1,1);
      board.place(0,2,1);
      assertEquals(board.getWinner(),2);
      
      board = new Board();
      board.place(0,2,2);
      board.place(1,2,2);
      board.place(2,2,2);
      assertEquals(board.getWinner(),2); 
      board.place(0,0,1);
      board.place(1,1,1);
      board.place(0,2,1);
      assertEquals(board.getWinner(),2);
  }
}
